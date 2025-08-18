package defpackage;

import android.widget.SeekBar;
import androidx.mediarouter.app.d;
import ru.ok.messages.settings.FrgBaseSettings;

/* loaded from: classes2.dex */
public final class vr0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public vr0(wr0 wr0Var, FrgBaseSettings frgBaseSettings) {
        this.a = 0;
        this.c = wr0Var;
        this.b = frgBaseSettings;
    }

    private final void a(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (z) {
                    dh8 dh8Var = (dh8) seekBar.getTag();
                    int i2 = d.z1;
                    dh8Var.j(i);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ((wr0) this.c).H0 = true;
                break;
            default:
                d dVar = (d) this.c;
                if (dVar.W0 != null) {
                    dVar.U0.removeCallbacks((q57) this.b);
                }
                dVar.W0 = (dh8) seekBar.getTag();
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                wr0 wr0Var = (wr0) this.c;
                gcd gcdVar = wr0Var.G0;
                if (gcdVar != null) {
                    ((FrgBaseSettings) this.b).u1(gcdVar.a, Integer.valueOf(seekBar.getProgress()));
                }
                wr0Var.H0 = false;
                break;
            default:
                ((d) this.c).U0.postDelayed((q57) this.b, 500L);
                break;
        }
    }

    public vr0(d dVar) {
        this.a = 1;
        this.c = dVar;
        this.b = new q57(10, this);
    }
}
