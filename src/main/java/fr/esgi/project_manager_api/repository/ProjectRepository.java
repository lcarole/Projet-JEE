package fr.esgi.project_manager_api.repository;

import fr.esgi.project_manager_api.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {}
