package units;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import static lombok.AccessLevel.PROTECTED;

@Data
@AllArgsConstructor(access = PROTECTED)
@Getter
public class ArtilleryUnit {
    private int hp;
    private int exp;
    private int damagePoints;
}
