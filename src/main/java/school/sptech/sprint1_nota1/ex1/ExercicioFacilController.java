package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {

        if(!palavra.isEmpty()){
            String p = palavra.toLowerCase();
            int i = 0;
            int j = p.length() - 1;

            while (i < j){

                char pi = p.charAt(i);
                char pj = p.charAt(j);

                if (pi != pj){
                    return false;
                }

                i++;
                j--;

            }
        }

        return true;

    }
}
