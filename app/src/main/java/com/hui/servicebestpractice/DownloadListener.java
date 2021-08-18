package com.hui.servicebestpractice;

public interface DownloadListener {
    void onProgress(int progress);//通知下载进度
    void onSuccess();//通知下载成功事件
    void onFailed();//下载失败
    void onPaused();//暂停
    void onCanceled();//取消
}
