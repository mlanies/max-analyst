package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.ExoPlaybackException;

/* loaded from: classes.dex */
public final /* synthetic */ class xx implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Handler.Callback c;

    public /* synthetic */ xx(Object obj, Handler.Callback callback, int i) {
        this.a = i;
        this.b = obj;
        this.c = callback;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                ((zx) this.b).getClass();
                r88 r88Var = (r88) this.c;
                r88Var.getClass();
                if (maf.a < 30) {
                    Handler handler = r88Var.b;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    s88 s88Var = (s88) r88Var.c;
                    if (r88Var == s88Var.x2) {
                        if (j == Long.MAX_VALUE) {
                            s88Var.J1 = true;
                            break;
                        } else {
                            try {
                                s88Var.q0(j);
                                s88Var.y0();
                                s88Var.L1.f++;
                                s88Var.x0();
                                s88Var.a0(j);
                                break;
                            } catch (ExoPlaybackException e) {
                                s88Var.K1 = e;
                                return;
                            }
                        }
                    }
                }
                break;
            case 1:
                ((ay) this.b).getClass();
                r88 r88Var2 = (r88) this.c;
                r88Var2.getClass();
                if (oaf.a >= 30) {
                    r88Var2.a(j);
                    break;
                } else {
                    Handler handler2 = r88Var2.b;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
            case 2:
                ((pl8) this.b).getClass();
                r88 r88Var3 = (r88) this.c;
                r88Var3.getClass();
                if (maf.a < 30) {
                    Handler handler3 = r88Var3.b;
                    handler3.sendMessageAtFrontOfQueue(Message.obtain(handler3, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    s88 s88Var2 = (s88) r88Var3.c;
                    if (r88Var3 == s88Var2.x2) {
                        if (j == Long.MAX_VALUE) {
                            s88Var2.J1 = true;
                            break;
                        } else {
                            try {
                                s88Var2.q0(j);
                                s88Var2.y0();
                                s88Var2.L1.f++;
                                s88Var2.x0();
                                s88Var2.a0(j);
                                break;
                            } catch (ExoPlaybackException e2) {
                                s88Var2.K1 = e2;
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                ((adb) this.b).getClass();
                r88 r88Var4 = (r88) this.c;
                r88Var4.getClass();
                if (oaf.a >= 30) {
                    r88Var4.a(j);
                    break;
                } else {
                    Handler handler4 = r88Var4.b;
                    handler4.sendMessageAtFrontOfQueue(Message.obtain(handler4, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
