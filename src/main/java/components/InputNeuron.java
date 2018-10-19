package components;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InputNeuron extends AbstractNeuron {
    private byte inputData;

    @Override
    public float getInputValue() {
        return inputData;
    }
}
