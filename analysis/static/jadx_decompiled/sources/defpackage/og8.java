package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import androidx.mediarouter.app.e;

/* loaded from: classes.dex */
public final class og8 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ og8(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    dh8 dh8Var = (dh8) seekBar.getTag();
                    e eVar = (e) ((pg8) this.b).G0.get(dh8Var.c);
                    if (eVar != null) {
                        eVar.B(i == 0);
                    }
                    dh8Var.j(i);
                    break;
                }
                break;
            default:
                w3b w3bVar = (w3b) this.b;
                if (!z || !w3bVar.v0) {
                    w3bVar.t0.setVisibility(8);
                    break;
                } else {
                    v3b v3bVar = w3bVar.w0;
                    if (v3bVar != null) {
                        ((g07) v3bVar).B0.g(new jv3(i));
                    }
                    uff uffVar = w3bVar.t0;
                    uffVar.b.setText(tfg.c(i));
                    t4b t4bVar = w3bVar.s0;
                    uffVar.setTranslationX(Math.min((t4bVar.getWidth() - w3bVar.o.getWidth()) - uffVar.getWidth(), Math.max(w3bVar.c.getWidth(), (t4bVar.getThumbOffset() + (w3bVar.getPaddingLeft() + t4bVar.getThumb().getBounds().centerX())) - (uffVar.getWidth() / 2.0f))));
                    break;
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                pg8 pg8Var = (pg8) this.b;
                if (pg8Var.H0 != null) {
                    pg8Var.C0.removeMessages(2);
                }
                pg8Var.H0 = (dh8) seekBar.getTag();
                break;
            default:
                v3b listener = ((w3b) this.b).getListener();
                if (listener != null) {
                    ((g07) listener).B0.g(kv3.a);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ((pg8) this.b).C0.sendEmptyMessageDelayed(2, 500L);
                break;
            default:
                w3b w3bVar = (w3b) this.b;
                v3b listener = w3bVar.getListener();
                if (listener != null) {
                    ((g07) listener).B0.g(new lv3(seekBar.getProgress()));
                }
                w3bVar.t0.setVisibility(8);
                break;
        }
    }
}
