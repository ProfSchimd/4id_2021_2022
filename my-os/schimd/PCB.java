public class PCB {
    private int processId;
    private String processName;
    // Assume 'int' has the size of registers
    private int programCounter;
    private int[] registers;
    // Opened files (described by paths)
    private String[] openFiles;
    
    public PCB(int pid) {
        this.processId = pid;
    }

    public int getPID() {
        return this.processId;
    }

    public String getProcessName() {
        return this.processName;
    }
    
    public int getProgramCounter() {
        return programCounter;
    }

    public int[] getRegisters() {
        return registers;
    }

    public String[] getOpenFiles() {
        return openFiles;
    }

    public void setProcessName(String pName) {
        this.processName = pName;
    }

    public void setProgramCounter(int pc) {
        this.programCounter = pc;
    }

    public void setRegisters(int[] regs) {
        this.registers = regs;
    }

    public void setOpenFiles(String[] ofs) {
        this.openFiles = ofs;
    }

    private void cleanOpenFiles() {
        this.openFiles = null;
    }
}