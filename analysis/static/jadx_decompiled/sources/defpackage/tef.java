package defpackage;

import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.tamtam.media.converter.VideoConverterException;

/* loaded from: classes2.dex */
public final /* synthetic */ class tef implements grd, l05 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ tef(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    @Override // defpackage.l05
    public void a(Surface surface) {
        Executor executor;
        zm4 zm4Var = (zm4) this.b;
        int iS = au1.s(zm4Var.b);
        lq1 lq1Var = (lq1) this.c;
        if (iS != 0) {
            if (iS == 1) {
                see seeVar = (see) this.o;
                if (seeVar.a()) {
                    Objects.toString(seeVar, "EMPTY");
                    lq1Var.b(null);
                    zm4Var.e();
                    return;
                } else {
                    zm4Var.g = surface;
                    Objects.toString(surface);
                    seeVar.b(surface, (Executor) zm4Var.d, new cy1(10, zm4Var));
                    zm4Var.b = 4;
                    lq1Var.b((d15) zm4Var.f);
                    return;
                }
            }
            if (iS != 2) {
                if (iS == 3) {
                    if (((l05) zm4Var.j) != null && (executor = (Executor) zm4Var.i) != null) {
                        executor.execute(new fre(zm4Var, 6, surface));
                    }
                    Objects.toString(surface);
                    return;
                }
                if (iS != 4) {
                    throw new IllegalStateException("State " + h4f.v(zm4Var.b) + " is not handled");
                }
            }
        }
        lq1Var.b(null);
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) throws Throwable {
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.o;
        switch (this.a) {
            case 0:
                wef wefVar = (wef) obj2;
                wefVar.getClass();
                kef kefVar = (kef) obj;
                hm9.m("wef", "copyFromUri: started for uri = %s", kefVar.a.a);
                lef lefVar = kefVar.a;
                String strA = ((cj0) wefVar.a).a(lefVar.a, ((it3) obj3).c);
                if (!kj6.h(strA)) {
                    if (!nqdVar.h()) {
                        nqdVar.onError(new VideoConverterException("failed to copy file"));
                        break;
                    }
                } else {
                    hm9.m("wef", "copyFromUri: finished for uri = %s", lefVar.a);
                    if (!nqdVar.h()) {
                        w36 w36VarA = kefVar.a();
                        w36VarA.c = strA;
                        nqdVar.a(new kef(w36VarA));
                        break;
                    }
                }
                break;
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6((py0) obj2, (lp1) obj, (WaitingRoomParticipants) obj3, nqdVar);
                break;
        }
    }
}
