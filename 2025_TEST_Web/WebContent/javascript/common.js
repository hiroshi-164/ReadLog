// ポップアップを開く関数
function openPopup() {
    var url = "menu.xhtml";  // ポップアップで表示するURL
    var width = 400;         // ポップアップの幅
    var height = 300;        // ポップアップの高さ
    var left = (window.innerWidth / 2) - (width / 2);  // 中央に配置
    var top = (window.innerHeight / 2) - (height / 2); // 中央に配置

    // ポップアップウィンドウを開く
    window.open(url, "menuPopup", "width=" + width + ",height=" + height + ",left=" + left + ",top=" + top + ",resizable=yes,scrollbars=yes");
}

// ポップアップを閉じる関数
function closePopup() {
    window.close();  // 現在のウィンドウを閉じる
}
