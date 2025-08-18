package defpackage;

/* loaded from: classes.dex */
public final class coc {
    public final uu3 a;
    public String b;
    public zu3 c;
    public zu3 d;
    public boolean e;
    public int f;

    public coc(uu3 uu3Var, String str, zu3 zu3Var, zu3 zu3Var2, boolean z, int i) {
        this.a = uu3Var;
        this.b = str;
        this.c = zu3Var;
        this.d = zu3Var2;
        this.e = z;
        this.f = i;
    }

    public final void a(zu3 zu3Var) {
        if (this.e) {
            throw new RuntimeException(coc.class.getSimpleName().concat("s can not be modified after being added to a Router."));
        }
        this.d = zu3Var;
    }

    public final zu3 b() {
        zu3 overriddenPushHandler = this.a.getOverriddenPushHandler();
        return overriddenPushHandler == null ? this.c : overriddenPushHandler;
    }

    public final void c(zu3 zu3Var) {
        if (this.e) {
            throw new RuntimeException(coc.class.getSimpleName().concat("s can not be modified after being added to a Router."));
        }
        this.c = zu3Var;
    }

    public final void d(String str) {
        if (this.e) {
            throw new RuntimeException(coc.class.getSimpleName().concat("s can not be modified after being added to a Router."));
        }
        this.b = str;
    }
}
