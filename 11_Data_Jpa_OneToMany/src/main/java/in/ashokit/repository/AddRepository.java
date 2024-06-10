package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Address;

public interface AddRepository extends JpaRepository<Address,Integer>
{

}
