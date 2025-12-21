public class TestDischargeStack {
    public static void main(String[] args){

        DischargeStack newStack = new DischargeStack();
        newStack.push(new DischargeRecord(990));
        newStack.push(new DischargeRecord(991));
        newStack.push(new DischargeRecord(992));
        newStack.push(new DischargeRecord(993));
        newStack.push(new DischargeRecord(996));

        newStack.pop();
        newStack.pop();

        newStack.printStack();

    }
}
