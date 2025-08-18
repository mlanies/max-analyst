package ru.ok.messages.video.fetcher;

/* loaded from: classes2.dex */
public class FetcherException extends RuntimeException {
    public final int a;

    public FetcherException(int i, String str) {
        super(str);
        this.a = i;
    }
}
