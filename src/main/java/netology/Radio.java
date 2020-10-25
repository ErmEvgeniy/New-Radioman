package netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int minStationNumber = 0;
    private int maxStationNumber = 10;
    private int minSound = 0;
    private int maxSound = 100;
    private int currentSound;
}
