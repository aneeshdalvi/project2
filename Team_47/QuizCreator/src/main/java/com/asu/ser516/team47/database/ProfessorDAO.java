package com.asu.ser516.team47.database;

import java.util.List;

/**
 * An interface for a Professor Data Access Object
 *
 * @author  Paul Horton
 * @version 1.0
 * @since   2019-02-22
 */
public interface ProfessorDAO {
    /**
     * Gets all professors in the table
     * @return all professor in the table
     */
    List<Professor> getAllProfessors();

    /**
     * Gets a professor based on it's username
     * @param username the id of the professor
     * @return a professor with the username
     */
    Professor getProfessor(String username);

    /**
     * Updates a professor in the database based on the
     * values in a business object
     * @param professor a professor to update in the database
     */
    void updateProfessor(Professor professor);

    /**
     * Deletes a professor in the database based on the
     * values in a business object.
     * @param professor
     */
    void deleteProfessor(Professor professor);
}