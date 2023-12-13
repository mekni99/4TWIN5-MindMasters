package esprit.tn.msbloc;

import esprit.tn.msbloc.Bloc;
import esprit.tn.msbloc.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor

@Service
public class BlocService {
    @Autowired
    private BlocRepository blocRepository;

    public List<Bloc> getAll(){
        return blocRepository.findAll();
    }
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public Bloc updateBloc(long idBloc, Bloc newBloc) {
        if (blocRepository.findById(idBloc).isPresent()) {
            Bloc existingBloc = blocRepository.findById(idBloc).get();
            existingBloc.setNomBloc(newBloc.getNomBloc());
            existingBloc.setCapaciteBloc(newBloc.getCapaciteBloc());


            return blocRepository.save(existingBloc);
        } else
            return null;
    }

    public String deleteBloc(long idBloc) {
        if (blocRepository.findById(idBloc).isPresent()) {
            blocRepository.deleteById(idBloc);
            return "bloc supprimé";
        } else
            return "bloc non supprimé";
    }
}




