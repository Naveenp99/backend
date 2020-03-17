package com.bdlabz.fundoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.bdlabz.fundoo.entitymodel.Notes;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Long> {

	Notes findByid(long id);
	
	@Query(value = "select * from notes_table where user_id=:userId", nativeQuery = true)
	List<Notes> getAllNotes(Long userId);
	
	@Query(value = "select * from notes_table where user_id=?", nativeQuery = true)
	public List<Notes> searchAllNoteByUserId(long userId);

	@Query(value = "select * from notes_table where user_id=? and notes_id=?", nativeQuery = true)
	public List<Notes> searchAllNotesByNoteId(long userId, long noteId);
	
	@Modifying
	@Query(value = "update notes_table set notes_color = :color where user_id = :userid and notes_id = :id", nativeQuery = true)
	void updateColor(long userid, long id, String color);
	
	@Modifying
	@Query(value = "delete from notes_table where user_id = :userId", nativeQuery = true)
	void empty(long userId);
	
	@Query(value = "select * from notes_table where user_id = :userId and notes_is_pin = true and notes_is_trash = false and notes_is_archive = false", nativeQuery = true)
	List<Notes> getallpinned(long userId);
	
	@Query(value = "select * from notes_table where user_id = :id and notes_is_pin = false",nativeQuery = true)
	List<Notes> getAllunPinnedNotes(long id);
	
	@Query(value = "select * from notes_table where user_id = :id and notes_is_pin = false and notes_is_trash = true and notes_is_archive = false",nativeQuery = true)
	List<Notes> getAllTrashedNotes(long id);
	
	@Query(value = "select * from notes_table where user_id = :id and notes_is_pin = false and notes_is_trash = false and notes_is_archive = true",nativeQuery = true)
	List<Notes> getallArchivedNotes(long id);
	
	@Query(value = "select * from notes_table where user_id = :id and notes_is_archive = false",nativeQuery = true)
	List<Notes> getallunArchivedNotes(long id);
	
}
