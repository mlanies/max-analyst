package defpackage;

/* loaded from: classes.dex */
public final class qwe extends yof {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public qwe(rwe rweVar, int i) {
        this.a = 0;
        this.d = rweVar;
        this.c = i;
        this.b = false;
    }

    @Override // defpackage.yof, defpackage.xof
    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.yof, defpackage.xof
    public final void b() {
        switch (this.a) {
            case 0:
                ((rwe) this.d).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    xof xofVar = ((wof) this.d).d;
                    if (xofVar != null) {
                        xofVar.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.xof
    public final void c() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((rwe) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i = this.c + 1;
                this.c = i;
                wof wofVar = (wof) this.d;
                if (i == wofVar.a.size()) {
                    xof xofVar = wofVar.d;
                    if (xofVar != null) {
                        xofVar.c();
                    }
                    this.c = 0;
                    this.b = false;
                    wofVar.e = false;
                    break;
                }
                break;
        }
    }

    public qwe(wof wofVar) {
        this.a = 1;
        this.d = wofVar;
        this.b = false;
        this.c = 0;
    }
}
