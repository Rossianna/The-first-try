package com.example.demo.entity.mapper;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.UserEntity;
@Repository
public interface UserEntityMapper{
public UserEntity findById(int id);//通过id获得词条信息
public void addStudent(UserEntity student);//增加词条
public void deleteStudent(int id);//通过id删除词条信息
public void updateStudent(UserEntity student);//更新词条
public List<UserEntity> find(UserEntity student);//查询单条用户信息
public List<UserEntity> findAllStudents();//查询全部用户信息;
}

//这个mapper的java文件导入了所有要操作的实体，并和之后的UserEntityMapper.xml共同指导数据库进行相关操作
