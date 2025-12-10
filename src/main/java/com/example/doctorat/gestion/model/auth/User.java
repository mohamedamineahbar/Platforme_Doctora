package com.example.doctorat.gestion.model.auth;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "auth_user")
@Data
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    @Column(nullable = false)
    private String password;

    @Column(name = "last_login")
    private String lastLogin; 
    
    @Column(name = "is_superuser")
    private Boolean isSuperuser = false; 

    @Column(unique = true, nullable = false, length = 150)
    private String username;
    
    @Column(name = "first_name", length = 150)
    private String firstName;
    
    @Column(name = "last_name", length = 150)
    private String lastName;
    
    @Column(unique = true, nullable = false, length = 254)
    private String email;
    
    @Column(name = "is_staff")
    private Boolean isStaff = false;
    
    @Column(name = "is_active")
    private Boolean isActive = true;
    
    @Column(name = "date_joined", nullable = false)
    private String dateJoined; 
    @ManyToMany
    @JoinTable(
        name = "auth_user_groups",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private Set<Group> groups = new HashSet<>();
    

    @ManyToMany
    @JoinTable(
        name = "auth_user_user_permissions",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private Set<Permission> userPermissions = new HashSet<>();
}