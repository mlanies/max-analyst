package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
public final class m8b implements DisplayManager.DisplayListener {
    public final /* synthetic */ q8b a;

    public m8b(q8b q8bVar) {
        this.a = q8bVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        q8b q8bVar = this.a;
        Display display = q8bVar.getDisplay();
        if (display == null || display.getDisplayId() != i) {
            return;
        }
        q8bVar.b();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
