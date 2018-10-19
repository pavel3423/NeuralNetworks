import components.*;

public class Main {
    public static void main(String[] args) {

        InputNeuron i1 = new InputNeuron((byte) 1);

        InputNeuron i2 = new InputNeuron((byte) 1);

        Synapse w1 = new Synapse(1f, i1);

        Synapse w2 = new Synapse(-1f, i1);

        Synapse w3 = new Synapse(-1f, i2);

        Synapse w4 = new Synapse(1f, i2);

        HiddenNeuron h1 = new HiddenNeuron();
        h1.getInputSynapses().add(w1);
        h1.getInputSynapses().add(w3);

        HiddenNeuron h2 = new HiddenNeuron();
        h2.getInputSynapses().add(w2);
        h2.getInputSynapses().add(w4);

        Synapse w5 = new Synapse(1f, h1);

        Synapse w6 = new Synapse(1f, h2);

        OutputNeuron o1 = new OutputNeuron();
        o1.getInputSynapses().add(w5);
        o1.getInputSynapses().add(w6);

        float result = o1.getInputValue();

        System.out.println("Result: " + result);

    }
}
