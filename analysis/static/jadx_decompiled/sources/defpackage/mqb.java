package defpackage;

/* loaded from: classes2.dex */
public enum mqb {
    P_2160("4K", 0, 3840, 2160, 20736000),
    /* JADX INFO: Fake field, exist only in values array */
    P_1440("2K", 1, 2560, 1440, 9216000),
    P_1080("1080p", 2, 1920, 1080, 5222400),
    P_720("720p", 3, 1280, 720, 2304000),
    P_480("480p", 4, 853, 480, 1024000),
    P_360("360p", 5, 640, 360, 576000),
    /* JADX INFO: Fake field, exist only in values array */
    P_240("240p", 6, 426, 240, 255720),
    P_144("144p", 7, 256, 144, 92160);

    public final int X;
    public final String a;
    public final int b;
    public final int c;
    public final int o;

    mqb(String str, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = i4;
    }
}
