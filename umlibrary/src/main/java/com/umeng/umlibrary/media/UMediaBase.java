package com.umeng.umlibrary.media;


import android.graphics.Bitmap;

import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.umlibrary.listener.SimpleShareListener;

import java.io.File;

/**
 * @author LiCheng
 * @date 2019/3/2
 */
public class UMediaBase<T extends UMediaBase> {

    byte[] mThumbBytes;
    Bitmap mThumbBitmap;
    File mThumbFile;
    int mThumbResource;
    String mThumbUrl;
    String mWithText;
    String mTitle;
    String mDescription;
    SHARE_MEDIA[] mPlatforms;
    boolean mIsBoardOnlyShowWechatAndSina;
    SimpleShareListener mSimpleShareListener;
    UMShareListener mCustomShareListener;

    @SuppressWarnings("unchecked")
    public T setThumb(String thumbUrl) {
        mThumbUrl = thumbUrl;
        return (T) this;
    }

    /**
     * 添加缩略图
     *
     * @param thumbResource
     * @return
     */
    public T setThumb(int thumbResource) {
        mThumbResource = thumbResource;
        return (T) this;
    }

    public T setThumb(Bitmap thumbBitmap) {
        mThumbBitmap = thumbBitmap;
        return (T) this;
    }

    public T setThumb(File thumbFile) {
        mThumbFile = thumbFile;
        return (T) this;
    }

    public T setThumb(byte[] thumbBytes) {
        mThumbBytes = thumbBytes;
        return (T) this;
    }

    /**
     * 添加标题
     *
     * @param title
     * @return
     */
    @SuppressWarnings("unchecked")
    public T setTitle(String title) {
        mTitle = title;
        return (T) this;
    }

    /**
     * 添加描述
     *
     * @param description
     * @return
     */
    @SuppressWarnings("unchecked")
    public T setDescription(String description) {
        mDescription = description;
        return (T) this;
    }

    /**
     * 带上文字
     *
     * @param withText
     * @return
     */
    @SuppressWarnings("unchecked")
    public T withText(String withText) {
        mWithText = withText;
        return (T) this;
    }

    /**
     * 设置分享面板包含的平台
     *
     * @param platforms
     * @return
     */
    @SuppressWarnings("unchecked")
    public T setBoardDisplayList(SHARE_MEDIA... platforms) {
        mPlatforms = platforms;
        return (T) this;
    }

    /**
     * 设置分享面板只分享微信好友、微信朋友圈和新浪
     *
     * @param isBoardOnlyShowWechatAndSina
     * @return
     */
    @SuppressWarnings("unchecked")
    public T setBoardOnlyShowWechatAndSina(boolean isBoardOnlyShowWechatAndSina) {
        mIsBoardOnlyShowWechatAndSina = isBoardOnlyShowWechatAndSina;
        return (T) this;
    }

    /**
     * 设置简单的分享结果监听
     *
     * @param simpleShareListener
     * @return
     */
    @SuppressWarnings("unchecked")
    public T setSimpleShareListener(SimpleShareListener simpleShareListener) {
        mSimpleShareListener = simpleShareListener;
        return (T) this;
    }

    /**
     * 设置完成的分享结果监听
     *
     * @param customShareListener
     * @return
     */
    @SuppressWarnings("unchecked")
    public T setCustomShareListener(UMShareListener customShareListener) {
        mCustomShareListener = customShareListener;
        return (T) this;
    }

}
