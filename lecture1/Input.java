import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // �L�[�{�[�h������͂��ꂽ���O���󂯎��u�悤�����A�i���͂��ꂽ���O�j����v�ƕ\��
        // 1. Scanner�I�u�W�F�N�g���v���O��������g����ϐ��ɑ��
        Scanner scanner = new Scanner(System.in);
        // 2. �u�����O�́H�F�v
        System.out.print("�����O�́H�F");
        // 3. ���͂��ꂽ���O��ϐ��ɑ��
        String name = scanner.next();
        // 4. �u�悤�����A�i���͂��ꂽ���O�j����v�ƕ\��
        System.out.println("�悤�����A" + name + "����");
        // 5. Scanner�I�u�W�F�N�g��j���i�N���[�Y�j
        scanner.close();
    }
}