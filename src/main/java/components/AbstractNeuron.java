package components;

import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
public abstract class AbstractNeuron implements Neuron {
    private final Set<Synapse> inputSynapses = new LinkedHashSet<Synapse>();

    public float getInputValue() {
        float value = 0;
        for (Synapse synapse : inputSynapses) {
            value = value + synapse.calculateValue();
        }
        return heavisideFunction(value);
    }

    private float sigmoid(float value) {
        return (float) (1 / (1 + Math.exp(-1 * value)));
    }

    private float heavisideFunction(float value) {
        if (value > 0.5) {
            return 1;
        } else {
            return 0;
        }
    }
}
