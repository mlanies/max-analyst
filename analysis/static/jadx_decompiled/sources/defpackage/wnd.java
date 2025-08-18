package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wnd {
    public static final /* synthetic */ wnd[] X;
    public static final wnd a;
    public static final wnd b;
    public static final wnd c;
    public static final wnd o;

    static {
        wnd wndVar = new wnd("LOADING", 0);
        a = wndVar;
        wnd wndVar2 = new wnd("CONTENT", 1);
        b = wndVar2;
        wnd wndVar3 = new wnd("CONTENT_SEARCH", 2);
        c = wndVar3;
        wnd wndVar4 = new wnd("EMPTY_SEARCH", 3);
        o = wndVar4;
        X = new wnd[]{wndVar, wndVar2, wndVar3, wndVar4};
    }

    public static wnd valueOf(String str) {
        return (wnd) Enum.valueOf(wnd.class, str);
    }

    public static wnd[] values() {
        return (wnd[]) X.clone();
    }
}
