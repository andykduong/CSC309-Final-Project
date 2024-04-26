
public class OriginalInstructions {

    private static Instruction[] instance;

    public OriginalInstructions (StepInstruction stepBlock,
                                  TurnInstruction turnBlock,
                                  PaintInstruction paintBlueBlock,
                                  PaintInstruction paintGreenBlock,
                                  PaintInstruction paintRedBlock) {
        instance = new Instruction[]{stepBlock, turnBlock, paintBlueBlock, paintGreenBlock, paintRedBlock};
    }

    public static Instruction[] getInstance() {
        return instance;
    }
}
