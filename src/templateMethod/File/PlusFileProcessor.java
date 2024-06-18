package templateMethod.File;

// 더하기 연산 수행
class PlusFileProcessor extends FileProcessor{

    public PlusFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int caculate(int result, int number) {
        return result += number;
    }

    @Override
    protected int getResult() {
        return 0;
    }
}
