package wildfly_bootable.repositories;

import java.util.List;
import java.util.UUID;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import wildfly_bootable.models.MessageModel;

@Stateless
public class MessageRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<MessageModel> selectAllMessages() {
		return em.createQuery("select m from MessageModel m", MessageModel.class).getResultList();
	}

	public void insertMessage(MessageModel message) {
		message.setId(UUID.randomUUID().toString());
		em.persist(message);
	}

}
