package com.suraj.lil.learningspring.data.repository;

import com.suraj.lil.learningspring.data.entity.Room;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{

}
