package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.SystemClock;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.obfuscated.b1;
import com.my.tracker.obfuscated.i;
import com.my.tracker.obfuscated.t;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.EncodedImage;
import org.webrtc.JniCommon;

/* loaded from: classes2.dex */
public final /* synthetic */ class ibg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ibg(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t54 t54Var;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo[] mediaCodecInfoArr;
        int i;
        t54 t54Var2;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) this.c;
                k8g k8gVar = (k8g) this.b;
                Iterator it = ((CopyOnWriteArrayList) k8gVar.b).iterator();
                while (it.hasNext()) {
                    loc locVar = (loc) it.next();
                    try {
                        locVar.getClass();
                        locVar.b.log(locVar.a, "<- [?]: " + th);
                    } catch (Throwable th2) {
                        ((a4c) k8gVar.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th2);
                    }
                }
                break;
            case 1:
                vbg vbgVar = (vbg) this.b;
                xag xagVar = (xag) this.c;
                vbgVar.l.incrementAndGet();
                vbgVar.u.a();
                int i2 = xagVar.b;
                long j = i2;
                long j2 = vbgVar.h;
                if (j != 1 + j2 && j2 != -1 && i2 != 0) {
                    a4c a4cVar = vbgVar.a;
                    StringBuilder sb = new StringBuilder("dropping ");
                    sb.append(xagVar.b);
                    sb.append(" due to seq (");
                    a4cVar.log("DecoderWrapper", zr6.k(sb, vbgVar.h, ")"));
                    vbgVar.n.incrementAndGet();
                    break;
                } else {
                    int i3 = 0;
                    if ((xagVar.a & 1) != 0) {
                        ax axVar = vbgVar.A;
                        ((wte) ((vte) axVar.b)).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Long l = (Long) axVar.c;
                        if (l != null) {
                            long jLongValue = jElapsedRealtime - l.longValue();
                            if (jLongValue > 1000) {
                                r36 r36Var = (r36) axVar.o;
                                axVar.o = new r36(r36Var.a + 1, r36Var.b + jLongValue);
                            }
                        }
                        axVar.c = Long.valueOf(jElapsedRealtime);
                        if (vbgVar.f != null) {
                            vbgVar.a.log("DecoderWrapper", "received start @ seq " + xagVar.b + " queue: " + vbgVar.f.c);
                            vbgVar.n.incrementAndGet();
                        }
                        vbgVar.m.incrementAndGet();
                        vbgVar.b();
                        vbgVar.f = new m2a(vbgVar, xagVar);
                    } else {
                        m2a m2aVar = vbgVar.f;
                        if (m2aVar != null) {
                            m2aVar.d |= (xagVar.a & 4) != 0;
                            while (true) {
                                int iMin = Math.min(xagVar.e.remaining(), ((vbg) m2aVar.f).c.length);
                                if (iMin == 0) {
                                    m2aVar.c++;
                                } else {
                                    xagVar.e.get(((vbg) m2aVar.f).c, 0, iMin);
                                    ((ByteArrayOutputStream) m2aVar.e).write(((vbg) m2aVar.f).c, 0, iMin);
                                }
                            }
                        }
                    }
                    if ((xagVar.a & 2) != 0) {
                        vbgVar.o.incrementAndGet();
                        vbgVar.v.a();
                        m2a m2aVar2 = vbgVar.f;
                        if (m2aVar2 == null) {
                            vbgVar.a.log("DecoderWrapper", "unexpected: trying to deliver 0 packets as frame");
                        } else {
                            int i4 = m2aVar2.b;
                            if (i4 != vbgVar.D || (t54Var2 = vbgVar.g) == null || t54Var2.s0) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                long j3 = vbgVar.i;
                                if (j3 == 0 || jElapsedRealtime2 - j3 >= vbg.G) {
                                    vbgVar.i = jElapsedRealtime2;
                                    String str = qbg.a[au1.s(i4)] != 1 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                                    int length = codecInfos.length;
                                    int i5 = 0;
                                    MediaCodecInfo mediaCodecInfo = null;
                                    MediaCodecInfo mediaCodecInfo2 = null;
                                    while (i5 < length) {
                                        MediaCodecInfo mediaCodecInfo3 = codecInfos[i5];
                                        if (!mediaCodecInfo3.isEncoder()) {
                                            String[] supportedTypes = mediaCodecInfo3.getSupportedTypes();
                                            int length2 = supportedTypes.length;
                                            int i6 = i3;
                                            while (i6 < length2) {
                                                if (supportedTypes[i6].equalsIgnoreCase(str)) {
                                                    String name = mediaCodecInfo3.getName();
                                                    String[] strArr = vbg.F;
                                                    mediaCodecInfoArr = codecInfos;
                                                    int length3 = strArr.length;
                                                    i = length;
                                                    int i7 = 0;
                                                    while (true) {
                                                        if (i7 < length3) {
                                                            int i8 = length3;
                                                            if (!name.startsWith(strArr[i7])) {
                                                                i7++;
                                                                length3 = i8;
                                                            }
                                                        } else if (mediaCodecInfo == null) {
                                                            mediaCodecInfo = mediaCodecInfo3;
                                                        }
                                                    }
                                                    if (mediaCodecInfo2 == null) {
                                                        mediaCodecInfo2 = mediaCodecInfo3;
                                                    }
                                                } else {
                                                    mediaCodecInfoArr = codecInfos;
                                                    i = length;
                                                }
                                                i6++;
                                                codecInfos = mediaCodecInfoArr;
                                                length = i;
                                            }
                                        }
                                        i5++;
                                        codecInfos = codecInfos;
                                        length = length;
                                        i3 = 0;
                                    }
                                    if (mediaCodecInfo == null) {
                                        mediaCodecInfo = mediaCodecInfo2;
                                    }
                                    if (mediaCodecInfo != null) {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                        if (capabilitiesForType != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                                            vbgVar.a.log("DecoderWrapper", "selecting " + mediaCodecInfo.getName());
                                            Integer num = (Integer) videoCapabilities.getSupportedWidths().getUpper();
                                            int i9 = (Integer) videoCapabilities.getSupportedHeightsFor(num.intValue()).getUpper();
                                            if (i9 == null) {
                                                i9 = 240;
                                            }
                                            vbgVar.j = num;
                                            vbgVar.k = i9;
                                            vbgVar.a.log("DecoderWrapper", "supports up to " + num + "x" + i9);
                                        }
                                        t54 t54Var3 = vbgVar.g;
                                        if (t54Var3 != null) {
                                            t54Var3.a();
                                            vbgVar.g = null;
                                            vbgVar.D = 0;
                                        }
                                        vbgVar.D = i4;
                                        vbgVar.g = new t54(vbgVar, i4, vbgVar.b, vbgVar.a);
                                    }
                                }
                            }
                            if (vbgVar.g != null) {
                                if (vbgVar.z.get() > 4000000) {
                                    t54 t54Var4 = vbgVar.g;
                                    t54Var4.t0 = true;
                                    t54Var4.w0.set(t54Var4.v0.get());
                                    vbgVar.r.incrementAndGet();
                                    vbgVar.B = true;
                                } else {
                                    m2a m2aVar3 = vbgVar.f;
                                    boolean z = m2aVar3.d;
                                    if (!vbgVar.B || z) {
                                        vbgVar.B = false;
                                        byte[] byteArray = ((ByteArrayOutputStream) m2aVar3.e).toByteArray();
                                        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(byteArray.length);
                                        byteBufferNativeAllocateByteBuffer.limit(byteArray.length);
                                        byteBufferNativeAllocateByteBuffer.put(byteArray);
                                        byteBufferNativeAllocateByteBuffer.rewind();
                                        vbgVar.y.incrementAndGet();
                                        vbgVar.z.addAndGet(byteBufferNativeAllocateByteBuffer.capacity());
                                        EncodedImage encodedImageCreateEncodedImage = EncodedImage.builder().setBuffer(byteBufferNativeAllocateByteBuffer, new kc(12)).setCaptureTimeNs(SystemClock.elapsedRealtimeNanos()).setEncodedWidth(vbgVar.j.intValue()).setEncodedHeight(vbgVar.k.intValue()).setFrameType(z ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta).createEncodedImage();
                                        t54 t54Var5 = vbgVar.g;
                                        if (t54Var5 != null) {
                                            EncodedImage.FrameType frameType = encodedImageCreateEncodedImage.frameType;
                                            EncodedImage.FrameType frameType2 = EncodedImage.FrameType.VideoFrameKey;
                                            boolean z2 = frameType == frameType2;
                                            boolean z3 = !z2;
                                            if (t54Var5.t0 && z3) {
                                                t54Var5.z0.r.incrementAndGet();
                                                vbg vbgVar2 = t54Var5.z0;
                                                ByteBuffer byteBuffer = encodedImageCreateEncodedImage.buffer;
                                                vbgVar2.y.decrementAndGet();
                                                byteBuffer.rewind();
                                                vbgVar2.z.addAndGet(-byteBuffer.capacity());
                                                JniCommon.nativeFreeByteBuffer(byteBuffer);
                                            } else {
                                                int i10 = t54Var5.u0.get();
                                                if (i10 > 30 || (i10 > 25 && z3)) {
                                                    t54Var5.z0.r.incrementAndGet();
                                                    vbg vbgVar3 = t54Var5.z0;
                                                    ByteBuffer byteBuffer2 = encodedImageCreateEncodedImage.buffer;
                                                    vbgVar3.y.decrementAndGet();
                                                    byteBuffer2.rewind();
                                                    vbgVar3.z.addAndGet(-byteBuffer2.capacity());
                                                    JniCommon.nativeFreeByteBuffer(byteBuffer2);
                                                    t54Var5.t0 = true;
                                                    t54Var5.w0.set(t54Var5.v0.get());
                                                } else {
                                                    t54Var5.t0 = false;
                                                    if (z2) {
                                                        t54Var5.v0.incrementAndGet();
                                                    }
                                                    int i11 = t54Var5.v0.get();
                                                    t54Var5.u0.incrementAndGet();
                                                    t54Var5.X.post(new si1(t54Var5, encodedImageCreateEncodedImage, i11, 5));
                                                }
                                            }
                                            if (encodedImageCreateEncodedImage.frameType == frameType2) {
                                                vbgVar.p.incrementAndGet();
                                            }
                                            if (encodedImageCreateEncodedImage.frameType == EncodedImage.FrameType.VideoFrameDelta) {
                                                vbgVar.q.incrementAndGet();
                                            }
                                        } else {
                                            vbgVar.y.decrementAndGet();
                                            byteBufferNativeAllocateByteBuffer.rewind();
                                            vbgVar.z.addAndGet(-byteBufferNativeAllocateByteBuffer.capacity());
                                            JniCommon.nativeFreeByteBuffer(byteBufferNativeAllocateByteBuffer);
                                            vbgVar.r.incrementAndGet();
                                        }
                                    } else {
                                        vbgVar.r.incrementAndGet();
                                    }
                                }
                            }
                        }
                        vbgVar.b();
                    }
                    if ((xagVar.a & 8) != 0 && (t54Var = vbgVar.g) != null) {
                        t54Var.a();
                        vbgVar.g = null;
                        vbgVar.D = 0;
                        break;
                    }
                }
                break;
            case 2:
                i.a((MyTracker.AttributionListener) this.b, (MyTrackerAttribution) this.c);
                break;
            case 3:
                ((t) this.b).b((b1) this.c);
                break;
            default:
                ((t) this.b).a((Boolean) this.c);
                break;
        }
    }
}
