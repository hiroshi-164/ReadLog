package test.biz;

import java.io.Serializable;

import javax.inject.Named;

import jakarta.enterprise.context.SessionScoped;

@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private String username;
    private String password;

    // Getter と Setter メソッド
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // ログイン処理のメソッド
    public String login() {
        // 仮の認証ロジック（ユーザー名とパスワードが一致する場合にログイン成功）
        if ("9999".equals(username) && "9999".equals(password)) {
            // ログイン成功時の遷移先
            return "welcome.xhtml";  // 遷移先のページ名
        } else {
            // ログイン失敗時のエラーメッセージ
            return "login.xhtml";  // 同じページに戻る
        }
    }
}
