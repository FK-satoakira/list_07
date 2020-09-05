package list07;

public class Main {
    public static void main(String[] args)
    throws Exception {
        System.out.println("計算を開始します。");
        /* : */     // この間に計算処理を行う
        System.out.println("計算完了。結果をメモ帳で表示します");
        ProcessBuilder pb = new ProcessBuilder(
            "c:\\windows\\system32\\notepad.exe",   /* メモ帳の実行ファイル */
            "calcreport.txt"
        );
        pb.start();     /* 起動！ */
    }
}
// 10行目のwindowsのiがoになってただけ。
// 10行目の"c:\\windows\\system32\\notepad.exe"はいじるとエラーが出る。notepad.exeがテキトーなフォルダにあればいいってもんじゃないらしい。
//  11行目は"C:\\Users\\rsc07\\Desktop\\programming\\sukkiri_java\\list07_test.txt"..などと書き換えてもうまくいった

// また、File、FileWriter、(ファイルに書き込む)らと併用も行けた
package list07;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args)
    throws Exception {
        try {
            File file = new File("C:\\Users\\rsc07\\Desktop\\programming\\sukkiri_java\\list07_test.txt");

            FileWriter filewriter = new FileWriter(file);
			for (int i = 0; i < 10000; i++) {

				filewriter.write("");
//				filewriter.write("お元気ですか¥n");
			}

            filewriter.close();
          } catch(IOException e) {
            System.out.println(e);
          }
        System.out.println("計算を開始します。");
        /* : */     // この間に計算処理を行う
        System.out.println("計算完了。結果をメモ帳で表示します");
        ProcessBuilder pb = new ProcessBuilder(
            "c:\\windows\\system32\\notepad.exe",   /* メモ帳の実行ファイル */
            "C:\\Users\\rsc07\\Desktop\\programming\\sukkiri_java\\list07_test.txt"     /*このtxtがデスクトップに出る*/

        );
        pb.start();     /* 起動！ */
    }
}
