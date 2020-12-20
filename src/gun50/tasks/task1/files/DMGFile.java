package gun50.tasks.task1.files;

public class DMGFile implements ReadFile {

    @Override
    public String open() {
        return "open in MacOS .dmg";
    }

    @Override
    public String read() {
        return "read in MacOS .dmg";
    }

    @Override
    public String save() {
        return "save in MacOS .dmg";
    }

    @Override
    public String close() {
        return "close in MacOS .dmg";
    }
}
