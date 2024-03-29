package sfgpetclinic.bootstrap;

import com.juletats.sfgpetclinic.model.Owner;
import com.juletats.sfgpetclinic.model.Vet;
import com.juletats.sfgpetclinic.services.OwnerService;
import com.juletats.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ashley");
        owner2.setLastName("Cotton");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Samson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Pem");
        vet2.setLastName("Thompson");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
