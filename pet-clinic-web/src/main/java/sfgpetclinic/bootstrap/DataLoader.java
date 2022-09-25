package sfgpetclinic.bootstrap;

import com.juletats.sfgpetclinic.model.Owner;
import com.juletats.sfgpetclinic.model.Vet;
import com.juletats.sfgpetclinic.services.OwnerService;
import com.juletats.sfgpetclinic.services.VetService;
import com.juletats.sfgpetclinic.services.map.OwnerServiceMap;
import com.juletats.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService=new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ashley");
        owner2.setLastName("Cotton");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setFirstName("Samson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Pem");
        vet2.setFirstName("Thompson");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
