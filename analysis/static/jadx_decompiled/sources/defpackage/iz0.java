package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final /* synthetic */ class iz0 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                xs xsVar = (xs) obj;
                if (xsVar.isEmpty()) {
                    return xsVar;
                }
                List list = (List) this.b;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(mqa.b(((ConversationParticipant) it.next()).getExternalId()).a));
                }
                xs xsVar2 = new xs(0);
                qs qsVar = new qs(xsVar);
                while (qsVar.hasNext()) {
                    Object next = qsVar.next();
                    if (!arrayList.contains(Long.valueOf(((Number) next).longValue()))) {
                        xsVar2.add(next);
                    }
                }
                return xsVar2;
            case 1:
                xs xsVar3 = (xs) obj;
                xsVar3.remove(Long.valueOf(((gg1) this.b).a));
                return xsVar3;
            case 2:
                CallsAudioManager callsAudioManager = (CallsAudioManager) obj;
                if (callsAudioManager != null) {
                    return callsAudioManager;
                }
                uq1 uq1Var = ((a11) this.b).a;
                uq1Var.getClass();
                CallsAudioManager.Builder disabledAudioDeviceUsagePolicy = new CallsAudioManager.Builder().setContext((Context) uq1Var.a.getValue()).setProximityTracker(uq1Var.c).setVideoTracker(new ync(20, new sq1(0, 0, r21.class, uq1Var.b.getValue(), "isVideoEnabled", "isVideoEnabled()Z"))).setDisabledAudioDeviceUsagePolicy(new tq1());
                ((x6a) uq1Var.d.getValue()).getClass();
                qyc qycVar = (qyc) ((y7d) uq1Var.e.getValue());
                qycVar.getClass();
                if (((int) qycVar.q(PmsKey.f27debugmode, 0)) == 3) {
                    disabledAudioDeviceUsagePolicy.setLogger((rq1) uq1Var.f.getValue());
                }
                return disabledAudioDeviceUsagePolicy.build();
            case 3:
                return (de2) this.b;
            case 4:
                return ((sb8) this.b).x();
            case 5:
                return (zc8) this.b;
            case 6:
                return (v1e) this.b;
            case 7:
                return (ms7) this.b;
            case 8:
                return (spa) this.b;
            case 9:
                Set setG0 = x53.G0((Set) obj);
                setG0.add((gza) this.b);
                return setG0;
            default:
                return Long.valueOf(((d4e) ((r0d) this.b)).o);
        }
    }
}
