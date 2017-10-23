package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistence.Equipement;
import persistence.Room;
import persistence.User;

/**
 * Session Bean implementation class BasicOps
 */
@Stateless
public class BasicOps implements BasicOpsRemote, BasicOpsLocal {

	/**
	 * Default constructor.
	 */
	public BasicOps() {
	}

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addUser(User user) {
		entityManager.persist(user);

	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
	}

	@Override
	public void deleteUserById(int id) {
		entityManager.remove(findUserById(id));
	}

	@Override
	public void deleteUser(User user) {
		entityManager.remove(user);
	}

	@Override
	public User findUserById(int id) {
		return entityManager.find(User.class, id);
	}

	@Override
	public List<User> findAllUsers() {
		String jpql = "SELECT u FROM User u";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public Room findRoomById(int id) {
		return entityManager.find(Room.class, id);
	}

	@Override
	public Equipement findEquipementById(int id) {
		return entityManager.find(Equipement.class, id);
	}

	@Override
	public void saveOrUpdateRoom(Room room) {
		entityManager.merge(room);
	}

	@Override
	public void saveOrUpdateEqipement(Equipement equipement) {
		entityManager.merge(equipement);
	}

}