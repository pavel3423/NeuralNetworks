package components;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Synapse {
    private float weight;
    private Neuron neuron;

    public float calculateValue() {
        return neuron.getInputValue() * weight;
    }
}
