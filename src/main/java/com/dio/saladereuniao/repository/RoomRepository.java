package com.dio.saladereuniao.repository;


import com.dio.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Identifica o repositório para JPA:
@Repository
public interface RoomRepository extends JpaRepository<Room,Long>{
}
