package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.pinbars.PinBarsWidget;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class ap8 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ap8(mn5 mn5Var, Object obj, int i) {
        this.a = i;
        this.b = mn5Var;
        this.c = obj;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new zb(on5Var, 28, (bp8) this.c), continuation);
                if (objD != tx3.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new o69(on5Var, 0, (MessagesListWidget) this.c), continuation);
                if (objD2 != tx3.a) {
                    break;
                }
                break;
            case 2:
                Object objD3 = this.b.d(new o69(on5Var, 1, (hyc) this.c), continuation);
                if (objD3 != tx3.a) {
                    break;
                }
                break;
            case 3:
                Object objD4 = this.b.d(new o69(on5Var, 2, (dza) this.c), continuation);
                if (objD4 != tx3.a) {
                    break;
                }
                break;
            case 4:
                Object objD5 = this.b.d(new o69(on5Var, 3, (pza) this.c), continuation);
                if (objD5 != tx3.a) {
                    break;
                }
                break;
            case 5:
                Object objD6 = this.b.d(new o69(on5Var, 4, (PinBarsWidget) this.c), continuation);
                if (objD6 != tx3.a) {
                    break;
                }
                break;
            case 6:
                Object objD7 = this.b.d(new o69(on5Var, 5, (o23) this.c), continuation);
                if (objD7 != tx3.a) {
                    break;
                }
                break;
            case 7:
                Object objD8 = this.b.d(new o69(on5Var, 6, (feb) this.c), continuation);
                if (objD8 != tx3.a) {
                    break;
                }
                break;
            case 8:
                Object objD9 = this.b.d(new o69(on5Var, 8, (vvc) this.c), continuation);
                if (objD9 != tx3.a) {
                    break;
                }
                break;
            case 9:
                Object objD10 = this.b.d(new o69(on5Var, 9, (vid) this.c), continuation);
                if (objD10 != tx3.a) {
                    break;
                }
                break;
            case 10:
                Object objD11 = this.b.d(new o69(on5Var, 10, (bod) this.c), continuation);
                if (objD11 != tx3.a) {
                    break;
                }
                break;
            case 11:
                Object objD12 = this.b.d(new o69(on5Var, 11, (ltd) this.c), continuation);
                if (objD12 != tx3.a) {
                    break;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Object objD13 = this.b.d(new o69(on5Var, 13, (b6e) this.c), continuation);
                if (objD13 != tx3.a) {
                    break;
                }
                break;
            case 13:
                Object objD14 = this.b.d(new o69(on5Var, 14, (a8e) this.c), continuation);
                if (objD14 != tx3.a) {
                    break;
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                Object objD15 = this.b.d(new o69(on5Var, 15, (v6f) this.c), continuation);
                if (objD15 != tx3.a) {
                    break;
                }
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                Object objD16 = this.b.d(new o69(on5Var, 16, (vqe) this.c), continuation);
                if (objD16 != tx3.a) {
                    break;
                }
                break;
            default:
                Object objD17 = this.b.d(new o69(on5Var, 17, (mif) this.c), continuation);
                if (objD17 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}
