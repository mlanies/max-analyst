package defpackage;

import com.facebook.animated.gif.GifImage;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j43 extends u84 {
    public boolean X;
    public a8g o;

    @Override // defpackage.l43, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                a8g a8gVar = this.o;
                if (a8gVar == null) {
                    return;
                }
                this.o = null;
                synchronized (a8gVar) {
                    o43.S((o43) a8gVar.c);
                    a8gVar.c = null;
                    o43.U((ArrayList) a8gVar.o);
                    a8gVar.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l43, defpackage.ru6
    public final synchronized int getHeight() {
        a8g a8gVar;
        a8gVar = this.o;
        return a8gVar == null ? 0 : ((GifImage) a8gVar.a).h();
    }

    @Override // defpackage.l43
    public final synchronized int getSizeInBytes() {
        a8g a8gVar;
        a8gVar = this.o;
        return a8gVar == null ? 0 : ((GifImage) a8gVar.a).j();
    }

    @Override // defpackage.l43, defpackage.ru6
    public final synchronized int getWidth() {
        a8g a8gVar;
        a8gVar = this.o;
        return a8gVar == null ? 0 : ((GifImage) a8gVar.a).k();
    }

    @Override // defpackage.l43
    public final synchronized boolean isClosed() {
        return this.o == null;
    }

    @Override // defpackage.ei0, defpackage.l43
    public final boolean isStateful() {
        return this.X;
    }
}
