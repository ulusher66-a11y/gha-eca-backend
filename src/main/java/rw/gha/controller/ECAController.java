package rw.gha.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.gha.entity.ECA;
import rw.gha.repository.ECARepository;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/ecas")
public class ECAController {

    private final ECARepository ecaRepository;

    public ECAController(ECARepository ecaRepository) {
        this.ecaRepository = ecaRepository;
    }

    @GetMapping
    public List<ECA> getAllECAs() {
        return ecaRepository.findAll();
    }

    @PostMapping
    public ECA createECA(@RequestBody ECA eca) {
        return ecaRepository.save(eca);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ECA> updateECA(@PathVariable Long id, @RequestBody ECA updatedECA) {
        return ecaRepository.findById(id)
                .map(existingECA -> {
                    existingECA.setName(updatedECA.getName());
                    existingECA.setCategory(updatedECA.getCategory());
                    existingECA.setDescription(updatedECA.getDescription());
                    existingECA.setDays(updatedECA.getDays());
                    ECA savedECA = ecaRepository.save(existingECA);
                    return ResponseEntity.ok(savedECA);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteECA(@PathVariable Long id) {
        if (ecaRepository.existsById(id)) {
            ecaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}