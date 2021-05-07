package co.com.telefonica.baseapp.ws.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import co.com.telefonica.baseapp.ws.ui.model.request.Entity;

public interface GenericEntityRepository extends JpaRepository<Entity, Long> {
	
}