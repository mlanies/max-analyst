package defpackage;

import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class y7f implements qj3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y7f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((UploadFileAttachWorker) this.b).e((Throwable) obj);
                break;
            default:
                ((Number) obj).longValue();
                ax axVar = (ax) this.b;
                bkb bkbVar = (bkb) axVar.b;
                aab aabVar = (aab) bkbVar.a;
                py3 py3Var = null;
                if (((Number) ((khe) aabVar.b).getValue()).longValue() > 0 && ((Number) ((khe) aabVar.a).getValue()).longValue() > 0) {
                    abg abgVar = (abg) bkbVar.c;
                    z9b z9bVarK = aab.k();
                    abg abgVar2 = z9bVarK == null ? null : new abg(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()), z9bVarK);
                    z9b z9bVarK2 = aab.k();
                    bkbVar.c = z9bVarK2 == null ? null : new abg(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()), z9bVarK2);
                    if (abgVar != null && abgVar2 != null) {
                        z9b z9bVar = abgVar2.b;
                        float f = z9bVar.a + z9bVar.b + z9bVar.c + z9bVar.d;
                        khe kheVar = (khe) bkbVar.b;
                        float fFloatValue = f / ((Number) kheVar.getValue()).floatValue();
                        z9b z9bVar2 = abgVar.b;
                        float fFloatValue2 = fFloatValue - ((z9bVar2.a + (z9bVar2.b + (z9bVar2.c + z9bVar2.d))) / ((Number) kheVar.getValue()).floatValue());
                        float fFloatValue3 = (abgVar2.a - (z9bVar.e / ((Number) kheVar.getValue()).floatValue())) - (abgVar.a - (z9bVar2.e / ((Number) kheVar.getValue()).floatValue()));
                        if (!Float.isInfinite(fFloatValue3) && !Float.isNaN(fFloatValue3) && fFloatValue3 != 0.0f) {
                            float fLongValue = (fFloatValue2 / fFloatValue3) / ((Number) ((khe) aabVar.a).getValue()).longValue();
                            if (0.0f <= fLongValue && fLongValue <= 1.0f) {
                                py3Var = new py3(fLongValue);
                            }
                        }
                    }
                }
                axVar.o = py3Var;
                break;
        }
    }

    public y7f(ViewGroup viewGroup) {
        this.a = 1;
        this.b = viewGroup.getOverlay();
    }
}
