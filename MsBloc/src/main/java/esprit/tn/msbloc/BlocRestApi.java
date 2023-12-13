package esprit.tn.msbloc;

import esprit.tn.msbloc.Bloc;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/Bloc")
public class BlocRestApi  {


    @Autowired
    private BlocService blocService;

    @RequestMapping
    public List<Bloc> getListBloc() {
        return blocService.getAll();
    }

    @PostMapping
    public ResponseEntity<Bloc> addBloc(@RequestBody Bloc bloc) {
        blocService.addBloc(bloc);
        return new ResponseEntity<>(bloc, HttpStatus.CREATED);
    }


    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Bloc> updateBloc(@PathVariable(value = "id") int id,
                                           @RequestBody Bloc bloc){
        return new ResponseEntity<>(blocService.updateBloc(id, bloc), HttpStatus.OK);
    }


    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteBloc(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(blocService.deleteBloc(id), HttpStatus.OK);
    }


}
