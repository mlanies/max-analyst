package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import defpackage.e5f;
import defpackage.f5;
import defpackage.k56;
import defpackage.kpa;
import defpackage.m30;
import defpackage.m56;
import defpackage.mz7;
import defpackage.p66;
import defpackage.rd7;
import defpackage.tpa;
import defpackage.u60;
import defpackage.vq1;
import defpackage.wg0;
import defpackage.x53;
import defpackage.xq1;
import defpackage.z53;
import defpackage.z84;
import defpackage.zr6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 È\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002È\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0018\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00192\u0010\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010(\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J7\u0010+\u001a\u00020\u00192\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00190%H\u0016¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u00020\u00192\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00190%H\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b.\u0010/J5\u00100\u001a\u00020\u00192\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0016¢\u0006\u0004\b0\u00101J=\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u0002022\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0016¢\u0006\u0004\b4\u00105J=\u00107\u001a\u00020\u00192\u0006\u00103\u001a\u0002062\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010;\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<JE\u0010?\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0019H\u0016¢\u0006\u0004\bA\u0010/J\u0019\u0010C\u001a\u00020\b2\b\b\u0002\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0019H\u0002¢\u0006\u0004\bE\u0010/J\u000f\u0010F\u001a\u00020\u0019H\u0002¢\u0006\u0004\bF\u0010/J\u0017\u0010G\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\bI\u0010HJ\u001f\u0010J\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\bH\u0003¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0019H\u0003¢\u0006\u0004\bL\u0010/J\u0017\u0010M\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u000202H\u0003¢\u0006\u0004\bM\u0010NJ\u0019\u0010O\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0019H\u0003¢\u0006\u0004\bQ\u0010/J\u000f\u0010R\u001a\u00020\u0019H\u0003¢\u0006\u0004\bR\u0010/J\u000f\u0010S\u001a\u00020\u0019H\u0003¢\u0006\u0004\bS\u0010/J\u000f\u0010T\u001a\u00020\u0019H\u0003¢\u0006\u0004\bT\u0010/J\u000f\u0010U\u001a\u00020\u0019H\u0003¢\u0006\u0004\bU\u0010/J\u000f\u0010V\u001a\u00020\u0019H\u0003¢\u0006\u0004\bV\u0010/J\u000f\u0010W\u001a\u00020\u0019H\u0003¢\u0006\u0004\bW\u0010/J\u000f\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020X2\b\u0010[\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\\\u0010]J\u001b\u0010^\u001a\u0004\u0018\u0001022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0004\b^\u0010_J\u0019\u0010`\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0004\b`\u0010 J\u0017\u0010b\u001a\u00020\u00192\u0006\u0010a\u001a\u000202H\u0002¢\u0006\u0004\bb\u0010NJ\u0017\u0010c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u000202H\u0003¢\u0006\u0004\bc\u0010NJ\u000f\u0010d\u001a\u00020\u0019H\u0002¢\u0006\u0004\bd\u0010/J\u000f\u0010e\u001a\u00020\u0019H\u0002¢\u0006\u0004\be\u0010/J\u000f\u0010f\u001a\u00020\u0019H\u0003¢\u0006\u0004\bf\u0010/J\u0017\u0010i\u001a\u00020\u00192\u0006\u0010h\u001a\u00020gH\u0003¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0019H\u0003¢\u0006\u0004\bk\u0010/J\u000f\u0010l\u001a\u00020\u0019H\u0003¢\u0006\u0004\bl\u0010/J\u000f\u0010m\u001a\u00020\u0019H\u0003¢\u0006\u0004\bm\u0010/J\u000f\u0010n\u001a\u00020\u0019H\u0002¢\u0006\u0004\bn\u0010/J\u000f\u0010o\u001a\u00020\u0019H\u0003¢\u0006\u0004\bo\u0010/JO\u0010r\u001a\u00020\u00192\u0006\u0010p\u001a\u00020X2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00190#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0002¢\u0006\u0004\br\u0010sJO\u0010t\u001a\u00020\u00192\u0006\u0010p\u001a\u00020X2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00190#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010#2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0019\u0018\u00010%H\u0002¢\u0006\u0004\bt\u0010sJ\u0019\u0010u\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u000109H\u0003¢\u0006\u0004\bu\u0010<J\u0017\u0010v\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u000202H\u0003¢\u0006\u0004\bv\u0010NJ\u0017\u0010w\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u000202H\u0003¢\u0006\u0004\bw\u0010NJ\u0017\u0010y\u001a\u00020\u00192\u0006\u0010x\u001a\u00020\bH\u0003¢\u0006\u0004\by\u0010zJ#\u0010}\u001a\u0002022\b\b\u0002\u0010{\u001a\u00020\b2\b\b\u0002\u0010|\u001a\u00020\bH\u0003¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u007f\u0010/J\u0011\u0010\u0080\u0001\u001a\u00020\u0019H\u0003¢\u0006\u0005\b\u0080\u0001\u0010/J)\u0010\u0082\u0001\u001a\u0011\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0081\u00012\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J&\u0010\u0085\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00170\u0081\u00010\u0084\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001d\u0010\u0088\u0001\u001a\u0004\u0018\u0001022\u0007\u0010\u0087\u0001\u001a\u000206H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u008a\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u008b\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u008c\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u008d\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u008e\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008b\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008b\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008b\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0098\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010\u009d\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001e\u0010 \u0001\u001a\t\u0012\u0004\u0012\u0002020\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R$\u0010£\u0001\u001a\u000f\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00170¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¥\u0001\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010©\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¨\u0001R\u0019\u0010ª\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u008b\u0001R\u0019\u0010«\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u008b\u0001R\u0019\u0010¬\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u008b\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u008b\u0001R\u0019\u0010®\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u008b\u0001R\u001b\u0010¯\u0001\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010²\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010³\u0001R\u0018\u0010µ\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010³\u0001R\u0018\u0010·\u0001\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0017\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010¹\u0001R\u001e\u0010»\u0001\u001a\t\u0012\u0004\u0012\u0002020\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010\u0086\u0001R\u0017\u0010¾\u0001\u001a\u0002028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0017\u0010¿\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0017\u0010Â\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010À\u0001R\u0017\u0010Ä\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010À\u0001R\u001d\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0017*\u0002028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006É\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl;", "Landroid/media/AudioDeviceCallback;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "Landroid/media/AudioManager$OnCommunicationDeviceChangedListener;", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "proximityTracker", "", "trackProximityWhenSpeakerEnabled", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "audioDeviceSelector", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "disabledAudioDeviceUsagePolicy", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "onMuteListener", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/ProximityTracker;ZLru/ok/android/externcalls/sdk/audio/VideoTracker;Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "", "Landroid/media/AudioDeviceInfo;", "addedDevices", "Le5f;", "onAudioDevicesAdded", "([Landroid/media/AudioDeviceInfo;)V", "removedDevices", "onAudioDevicesRemoved", "device", "onCommunicationDeviceChanged", "(Landroid/media/AudioDeviceInfo;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "state", "Lkotlin/Function0;", "onComplete", "Lkotlin/Function1;", "", "onError", "changeStateAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;Lk56;Lm56;)V", "onSuccess", "hasBluetoothHeadsetAsync", "(Lm56;Lm56;)V", "hasWiredHeadsetAsync", "notifyBluetoothPermissionGranted", "()V", "releaseAsync", "(Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "audioDevice", "setAudioDeviceAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "setAudioDeviceTypeAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "listener", "setOnAudioDeviceChangeListener", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;)V", "enabled", "byVideoTurnedOn", "setSpeakerEnabledAsync", "(ZZLk56;Lm56;)V", "requestAudioFocusAsync", "byStopRinging", "updateAvailableDeviceList", "(Z)Z", "maybeSyncAudioDeviceList", "syncAudioDeviceList", "changeState", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;)V", "onCallStateChangedInternal", "setSpeakerEnabled", "(ZZ)V", "startTrackingAudioDevices", "selectAudioDevice", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V", "setCommunicationDevice", "(Landroid/media/AudioDeviceInfo;)Z", "cancelScheduledTrySetCommunicationDeviceAgain", "scheduleTryToSetCommunicationDeviceAgain", "trySetCommunicationDeviceAgain", "trySetCommunicationDeviceAgainUnsafe", "cancelScheduledSyncWithSystemCommunicationDevice", "scheduleSyncWithSystemCommunicationDevice", "syncWithSystemCommunicationDevice", "", "getAudioManagerStateDetails", "()Ljava/lang/String;", "info", "androidDeviceToString", "(Landroid/media/AudioDeviceInfo;)Ljava/lang/String;", "getDeviceForAndroidDevice", "(Landroid/media/AudioDeviceInfo;)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "handleCurrentCommunicationDevice", "selectedDevice", "applyCurrentDevice", "reportCurrentCallsAudioDevice", "start", "requestAudioFocus", "releaseAudioFocus", "", "mode", "setAudioManagerModeSafe", "(I)V", "release", "rememberUtilizedDeviceType", "maybeRecoverUtilizedDeviceType", "cancelUtilizedDeviceTypeRecovery", "recoverPreviouslyUtilizedDeviceType", "action", "block", "doOnOwnThread", "(Ljava/lang/String;Lk56;Lk56;Lm56;)V", "doOnOwnThreadUnsafe", "setOnAudioDeviceChangeListenerImpl", "setAudioDevice", "reportAudioDeviceOnMainThread", "speakerOn", "updateProximityTrackingState", "(Z)V", "bluetooth", "respectSpeakerEnabled", "getPreferredAudioDevice", "(ZZ)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "savePreviousState", "restorePreviousAudioState", "Lkpa;", "mapAndroidDeviceToCallsDevice", "(Landroid/media/AudioDeviceInfo;)Lkpa;", "", "getAvailableDevices", "()Ljava/util/List;", "type", "firstOfType", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "Z", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "isDestroyed", "isStarted", "isInCall", "Landroid/os/HandlerThread;", "backgroundHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "workerThreadHandler", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "lastKnownAudioDeviceType", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "", "callsAudioDevices", "Ljava/util/List;", "", "audioDeviceByCallsDevice", "Ljava/util/Map;", "audioDeviceSyncCount", "I", "usedDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "reportedAudioDevice", "disabledBluetoothOnce", "disabledSpeakerOnce", "savedPreviousState", "savedIsSpeakerPhoneOn", "savedIsMicrophoneMute", "onAudioDeviceChangeListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "Ljava/lang/Runnable;", "recoverDeviceByTypeRunnable", "Ljava/lang/Runnable;", "syncWithSystemCommunicationDeviceRunnable", "tryAgainRunnable", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "audioFocusRequestHelper", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "getAvailableAudioDevices", "availableAudioDevices", "getCurrentDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "currentDevice", "isHeadsetConnected", "()Z", "getHasWiredHeadset", "hasWiredHeadset", "getHasEarpiece", "hasEarpiece", "getAudioDeviceInfo", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)Landroid/media/AudioDeviceInfo;", "audioDeviceInfo", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
@TargetApi(31)
/* loaded from: classes2.dex */
public final class CallsAudioManagerV3Impl extends AudioDeviceCallback implements CallsAudioManager, AudioManager$OnCommunicationDeviceChangedListener {
    private static final Companion Companion = new Companion(null);
    private static final CallsAudioDeviceInfo NO_DEVICE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");

    @Deprecated
    public static final long ROLLBACK_TO_ACTUAL_DEVICE_TIMEOUT_MS = 2000;

    @Deprecated
    public static final String TAG = "CallsAudioManagerV3Impl";

    @Deprecated
    public static final long TRY_AGAIN_TIMEOUT_MS = 2000;

    @Deprecated
    public static final long USED_DEVICE_RECOVER_TIMEOUT_MS = 3000;
    private final Map<CallsAudioDeviceInfo, AudioDeviceInfo> audioDeviceByCallsDevice;
    private final AudioDeviceSelector audioDeviceSelector;
    private int audioDeviceSyncCount;
    private final AudioFocusRequestHelper audioFocusRequestHelper;
    private final AudioManager audioManager;
    private final HandlerThread backgroundHandlerThread;
    private final List<CallsAudioDeviceInfo> callsAudioDevices;
    private final CallsAudioManager.DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy;
    private boolean disabledBluetoothOnce;
    private boolean disabledSpeakerOnce;
    private boolean isDestroyed;
    private boolean isInCall;
    private boolean isStarted;
    private CallsAudioManager.AudioDeviceType lastKnownAudioDeviceType;
    private final Logger logger;
    private final Handler mainHandler;
    private CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceChangeListener;
    private final ProximityTracker proximityTracker;
    private final Runnable recoverDeviceByTypeRunnable;
    private CallsAudioDeviceInfo reportedAudioDevice;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private boolean savedPreviousState;
    private CallsAudioManager.State state;
    private final Runnable syncWithSystemCommunicationDeviceRunnable;
    private final boolean trackProximityWhenSpeakerEnabled;
    private final Runnable tryAgainRunnable;
    private CallsAudioDeviceInfo usedDevice;
    private final VideoTracker videoTracker;
    private final Handler workerThreadHandler;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends p66 implements k56 {
        public AnonymousClass1(Object obj) {
            super(0, 0, CallsAudioManagerV3Impl.class, obj, "maybeRecoverUtilizedDeviceType", "maybeRecoverUtilizedDeviceType()V");
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m94invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m94invoke() {
            ((CallsAudioManagerV3Impl) this.receiver).maybeRecoverUtilizedDeviceType();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends p66 implements k56 {
        public AnonymousClass2(Object obj) {
            super(0, 0, CallsAudioManagerV3Impl.class, obj, "rememberUtilizedDeviceType", "rememberUtilizedDeviceType()V");
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m95invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m95invoke() {
            ((CallsAudioManagerV3Impl) this.receiver).rememberUtilizedDeviceType();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$3, reason: invalid class name */
    public static final class AnonymousClass3 extends rd7 implements k56 {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.k56
        public final Boolean invoke() {
            return Boolean.valueOf(CallsAudioManagerV3Impl.this.isDestroyed);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl$Companion;", "", "()V", "NO_DEVICE", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "getNO_DEVICE", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "ROLLBACK_TO_ACTUAL_DEVICE_TIMEOUT_MS", "", "TAG", "", "TRY_AGAIN_TIMEOUT_MS", "USED_DEVICE_RECOVER_TIMEOUT_MS", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final CallsAudioDeviceInfo getNO_DEVICE() {
            return CallsAudioManagerV3Impl.NO_DEVICE;
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallsAudioManager.State.values().length];
            try {
                iArr[CallsAudioManager.State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallsAudioManager.State.RINGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallsAudioManager.State.DIALING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallsAudioManager.State.CONVERSATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$changeStateAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00201 extends rd7 implements k56 {
        final /* synthetic */ CallsAudioManager.State $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00201(CallsAudioManager.State state) {
            super(0);
            this.$state = state;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m96invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m96invoke() {
            CallsAudioManagerV3Impl.this.changeState(this.$state);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/media/AudioDeviceInfo;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$getAudioManagerStateDetails$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00211 extends rd7 implements m56 {
        public C00211() {
            super(1);
        }

        @Override // defpackage.m56
        public final CharSequence invoke(AudioDeviceInfo audioDeviceInfo) {
            return CallsAudioManagerV3Impl.this.androidDeviceToString(audioDeviceInfo);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$hasBluetoothHeadsetAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00221 extends rd7 implements k56 {
        final /* synthetic */ m56 $onSuccess;
        final /* synthetic */ CallsAudioManagerV3Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00221(m56 m56Var, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
            super(0);
            this.$onSuccess = m56Var;
            this.this$0 = callsAudioManagerV3Impl;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m97invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m97invoke() {
            Object next;
            m56 m56Var = this.$onSuccess;
            Iterator it = this.this$0.callsAudioDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((CallsAudioDeviceInfo) next).getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH) {
                        break;
                    }
                }
            }
            m56Var.invoke(Boolean.valueOf(next != null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00231 extends rd7 implements k56 {
        final /* synthetic */ m56 $onSuccess;
        final /* synthetic */ CallsAudioManagerV3Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00231(m56 m56Var, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
            super(0);
            this.$onSuccess = m56Var;
            this.this$0 = callsAudioManagerV3Impl;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m98invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m98invoke() {
            Object next;
            m56 m56Var = this.$onSuccess;
            Iterator it = this.this$0.callsAudioDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((CallsAudioDeviceInfo) next).getDeviceType() == CallsAudioManager.AudioDeviceType.WIRED_HEADSET) {
                        break;
                    }
                }
            }
            m56Var.invoke(Boolean.valueOf(next != null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$onCommunicationDeviceChanged$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00241 extends rd7 implements k56 {
        final /* synthetic */ AudioDeviceInfo $device;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00241(AudioDeviceInfo audioDeviceInfo) {
            super(0);
            this.$device = audioDeviceInfo;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m99invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m99invoke() {
            CallsAudioManagerV3Impl.this.cancelScheduledSyncWithSystemCommunicationDevice();
            CallsAudioDeviceInfo deviceForAndroidDevice = CallsAudioManagerV3Impl.this.getDeviceForAndroidDevice(this.$device);
            if (deviceForAndroidDevice != null) {
                CallsAudioManager.AudioDeviceType deviceType = deviceForAndroidDevice.getDeviceType();
                CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                if (deviceType != audioDeviceType && CallsAudioManagerV3Impl.this.usedDevice.getDeviceType() == audioDeviceType) {
                    Logger logger = CallsAudioManagerV3Impl.this.logger;
                    AudioDeviceInfo audioDeviceInfo = this.$device;
                    Integer numValueOf = audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null;
                    AudioDeviceInfo audioDeviceInfo2 = this.$device;
                    Integer numValueOf2 = audioDeviceInfo2 != null ? Integer.valueOf(audioDeviceInfo2.getType()) : null;
                    AudioDeviceInfo audioDeviceInfo3 = this.$device;
                    logger.d(CallsAudioManagerV3Impl.TAG, "Unexpected device reported by system " + numValueOf + ":" + numValueOf2 + ":" + ((Object) (audioDeviceInfo3 != null ? audioDeviceInfo3.getProductName() : null)));
                    CallsAudioManagerV3Impl.this.scheduleSyncWithSystemCommunicationDevice();
                    return;
                }
            }
            CallsAudioManagerV3Impl.this.cancelScheduledTrySetCommunicationDeviceAgain();
            Logger logger2 = CallsAudioManagerV3Impl.this.logger;
            AudioDeviceInfo audioDeviceInfo4 = this.$device;
            Integer numValueOf3 = audioDeviceInfo4 != null ? Integer.valueOf(audioDeviceInfo4.getId()) : null;
            AudioDeviceInfo audioDeviceInfo5 = this.$device;
            Integer numValueOf4 = audioDeviceInfo5 != null ? Integer.valueOf(audioDeviceInfo5.getType()) : null;
            AudioDeviceInfo audioDeviceInfo6 = this.$device;
            logger2.d(CallsAudioManagerV3Impl.TAG, "Communication device did change to " + numValueOf3 + ":" + numValueOf4 + ":" + ((Object) (audioDeviceInfo6 != null ? audioDeviceInfo6.getProductName() : null)));
            CallsAudioManagerV3Impl.this.handleCurrentCommunicationDevice(this.$device);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$releaseAsync$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C00251 extends p66 implements k56 {
        public C00251(Object obj) {
            super(0, 0, CallsAudioManagerV3Impl.class, obj, "release", "release()V");
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m100invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m100invoke() {
            ((CallsAudioManagerV3Impl) this.receiver).release();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$requestAudioFocusAsync$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C00261 extends p66 implements k56 {
        public C00261(Object obj) {
            super(0, 0, CallsAudioManagerV3Impl.class, obj, "requestAudioFocus", "requestAudioFocus()V");
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m101invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m101invoke() {
            ((CallsAudioManagerV3Impl) this.receiver).requestAudioFocus();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$requestAudioFocusAsync$2, reason: invalid class name and case insensitive filesystem */
    public static final class C00272 extends rd7 implements k56 {
        public C00272() {
            super(0);
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m102invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m102invoke() {
            CallsAudioManagerV3Impl.this.logger.d(CallsAudioManagerV3Impl.TAG, "audio focus request proceeded");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Le5f;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$requestAudioFocusAsync$3, reason: invalid class name and case insensitive filesystem */
    public static final class C00283 extends rd7 implements m56 {
        public C00283() {
            super(1);
        }

        @Override // defpackage.m56
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return e5f.a;
        }

        public final void invoke(Throwable th) {
            CallsAudioManagerV3Impl.this.logger.e(CallsAudioManagerV3Impl.TAG, "audio focus request failed", th);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setAudioDeviceAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00291 extends rd7 implements k56 {
        final /* synthetic */ CallsAudioDeviceInfo $audioDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00291(CallsAudioDeviceInfo callsAudioDeviceInfo) {
            super(0);
            this.$audioDevice = callsAudioDeviceInfo;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m103invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m103invoke() {
            CallsAudioManagerV3Impl.this.setAudioDevice(this.$audioDevice);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setAudioDeviceTypeAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00301 extends rd7 implements k56 {
        final /* synthetic */ CallsAudioManager.AudioDeviceType $audioDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00301(CallsAudioManager.AudioDeviceType audioDeviceType) {
            super(0);
            this.$audioDevice = audioDeviceType;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m104invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m104invoke() {
            CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType = CallsAudioManagerV3Impl.this.firstOfType(this.$audioDevice);
            if (callsAudioDeviceInfoFirstOfType != null) {
                CallsAudioManagerV3Impl.this.setAudioDevice(callsAudioDeviceInfoFirstOfType);
                return;
            }
            CallsAudioManagerV3Impl.this.logger.e(CallsAudioManagerV3Impl.TAG, "Device not found for type " + this.$audioDevice);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setOnAudioDeviceChangeListener$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00311 extends rd7 implements k56 {
        final /* synthetic */ CallsAudioManager.OnAudioDeviceInfoChangeListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00311(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
            super(0);
            this.$listener = onAudioDeviceInfoChangeListener;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m105invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m105invoke() {
            CallsAudioManagerV3Impl.this.setOnAudioDeviceChangeListenerImpl(this.$listener);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setSpeakerEnabledAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00321 extends rd7 implements k56 {
        final /* synthetic */ boolean $byVideoTurnedOn;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00321(boolean z, boolean z2) {
            super(0);
            this.$enabled = z;
            this.$byVideoTurnedOn = z2;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m106invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m106invoke() {
            CallsAudioManagerV3Impl.this.setSpeakerEnabled(this.$enabled, this.$byVideoTurnedOn);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$syncAudioDeviceList$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00331 extends rd7 implements m56 {
        public static final C00331 INSTANCE = new C00331();

        public C00331() {
            super(1);
        }

        @Override // defpackage.m56
        public final CharSequence invoke(CallsAudioDeviceInfo callsAudioDeviceInfo) {
            return callsAudioDeviceInfo.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$syncAudioDeviceList$3, reason: invalid class name and case insensitive filesystem */
    public static final class C00343 extends rd7 implements m56 {
        public static final C00343 INSTANCE = new C00343();

        public C00343() {
            super(1);
        }

        @Override // defpackage.m56
        public final CharSequence invoke(CallsAudioDeviceInfo callsAudioDeviceInfo) {
            return callsAudioDeviceInfo.toString();
        }
    }

    public CallsAudioManagerV3Impl(Context context, ProximityTracker proximityTracker, boolean z, VideoTracker videoTracker, AudioDeviceSelector audioDeviceSelector, CallsAudioManager.DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy, CallsAudioManager.OnMuteListener onMuteListener, Logger logger) {
        this.proximityTracker = proximityTracker;
        this.trackProximityWhenSpeakerEnabled = z;
        this.videoTracker = videoTracker;
        this.audioDeviceSelector = audioDeviceSelector;
        this.disabledAudioDeviceUsagePolicy = disabledAudioDeviceUsagePolicy;
        this.logger = logger;
        HandlerThread handlerThread = new HandlerThread("CallsAudioManagerV3Thread");
        this.backgroundHandlerThread = handlerThread;
        this.lastKnownAudioDeviceType = CallsAudioManager.AudioDeviceType.NONE;
        this.callsAudioDevices = new ArrayList();
        this.audioDeviceByCallsDevice = new LinkedHashMap();
        CallsAudioDeviceInfo.Companion companion = CallsAudioDeviceInfo.INSTANCE;
        this.usedDevice = companion.getNONE();
        this.reportedAudioDevice = companion.getNONE();
        final int i = 0;
        this.recoverDeviceByTypeRunnable = new Runnable(this) { // from class: wq1
            public final /* synthetic */ CallsAudioManagerV3Impl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                CallsAudioManagerV3Impl callsAudioManagerV3Impl = this.b;
                switch (i2) {
                    case 0:
                        CallsAudioManagerV3Impl.recoverDeviceByTypeRunnable$lambda$0(callsAudioManagerV3Impl);
                        break;
                    case 1:
                        callsAudioManagerV3Impl.syncWithSystemCommunicationDevice();
                        break;
                    default:
                        callsAudioManagerV3Impl.trySetCommunicationDeviceAgain();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.syncWithSystemCommunicationDeviceRunnable = new Runnable(this) { // from class: wq1
            public final /* synthetic */ CallsAudioManagerV3Impl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                CallsAudioManagerV3Impl callsAudioManagerV3Impl = this.b;
                switch (i22) {
                    case 0:
                        CallsAudioManagerV3Impl.recoverDeviceByTypeRunnable$lambda$0(callsAudioManagerV3Impl);
                        break;
                    case 1:
                        callsAudioManagerV3Impl.syncWithSystemCommunicationDevice();
                        break;
                    default:
                        callsAudioManagerV3Impl.trySetCommunicationDeviceAgain();
                        break;
                }
            }
        };
        final int i3 = 2;
        this.tryAgainRunnable = new Runnable(this) { // from class: wq1
            public final /* synthetic */ CallsAudioManagerV3Impl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                CallsAudioManagerV3Impl callsAudioManagerV3Impl = this.b;
                switch (i22) {
                    case 0:
                        CallsAudioManagerV3Impl.recoverDeviceByTypeRunnable$lambda$0(callsAudioManagerV3Impl);
                        break;
                    case 1:
                        callsAudioManagerV3Impl.syncWithSystemCommunicationDevice();
                        break;
                    default:
                        callsAudioManagerV3Impl.trySetCommunicationDeviceAgain();
                        break;
                }
            }
        };
        this.state = CallsAudioManager.State.IDLE;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.workerThreadHandler = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.mainHandler = handler2;
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.audioManager = audioManager;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
        this.audioFocusRequestHelper = new AudioFocusRequestHelper(audioManager, onMuteListener, handler2, handler, new AnonymousClass3(), logger, new AnonymousClass2(this), anonymousClass1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String androidDeviceToString(AudioDeviceInfo info) {
        if (info == null) {
            return "null";
        }
        try {
            return info.getId() + ":" + info.getType() + ":" + ((Object) info.getProductName());
        } catch (Throwable th) {
            return wg0.i("error: ", th.getMessage());
        }
    }

    private final void applyCurrentDevice(CallsAudioDeviceInfo selectedDevice) {
        this.logger.d(TAG, "Cancel try again schedule because of used device change to " + selectedDevice);
        cancelScheduledTrySetCommunicationDeviceAgain();
        this.usedDevice = selectedDevice;
        reportCurrentCallsAudioDevice(selectedDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelScheduledSyncWithSystemCommunicationDevice() {
        this.workerThreadHandler.removeCallbacks(this.syncWithSystemCommunicationDeviceRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelScheduledTrySetCommunicationDeviceAgain() {
        this.workerThreadHandler.removeCallbacks(this.tryAgainRunnable);
    }

    private final void cancelUtilizedDeviceTypeRecovery() {
        this.logger.d(TAG, "Cancelling audio device recovery by type " + this.lastKnownAudioDeviceType + " (maybe)");
        this.workerThreadHandler.removeCallbacks(this.recoverDeviceByTypeRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeState(CallsAudioManager.State state) {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(TAG, "requested " + state);
        onCallStateChangedInternal(state);
    }

    private final void doOnOwnThread(String action, k56 block, k56 onComplete, m56 onError) {
        try {
            doOnOwnThreadUnsafe(action, block, onComplete, onError);
        } catch (Throwable th) {
            this.logger.e(TAG, zr6.i("error posting action ", action, " for execution"), th);
        }
    }

    public static /* synthetic */ void doOnOwnThread$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, k56 k56Var, k56 k56Var2, m56 m56Var, int i, Object obj) {
        if ((i & 4) != 0) {
            k56Var2 = null;
        }
        if ((i & 8) != 0) {
            m56Var = null;
        }
        callsAudioManagerV3Impl.doOnOwnThread(str, k56Var, k56Var2, m56Var);
    }

    private final void doOnOwnThreadUnsafe(String action, k56 block, k56 onComplete, m56 onError) {
        this.workerThreadHandler.post(new vq1(block, onComplete, this, action, onError));
    }

    public static /* synthetic */ void doOnOwnThreadUnsafe$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, k56 k56Var, k56 k56Var2, m56 m56Var, int i, Object obj) {
        if ((i & 4) != 0) {
            k56Var2 = null;
        }
        if ((i & 8) != 0) {
            m56Var = null;
        }
        callsAudioManagerV3Impl.doOnOwnThreadUnsafe(str, k56Var, k56Var2, m56Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doOnOwnThreadUnsafe$lambda$8(k56 k56Var, k56 k56Var2, CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, m56 m56Var) {
        try {
            k56Var.invoke();
            if (k56Var2 != null) {
                k56Var2.invoke();
            }
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "error on executing action ".concat(str), th);
            if (m56Var != null) {
                m56Var.invoke(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallsAudioDeviceInfo firstOfType(CallsAudioManager.AudioDeviceType type) {
        Object next;
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CallsAudioDeviceInfo) next).getDeviceType() == type) {
                break;
            }
        }
        return (CallsAudioDeviceInfo) next;
    }

    private final AudioDeviceInfo getAudioDeviceInfo(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        return this.audioDeviceByCallsDevice.get(callsAudioDeviceInfo);
    }

    private final String getAudioManagerStateDetails() {
        try {
            return x53.n0(this.audioManager.getAvailableCommunicationDevices(), ",", null, null, new C00211(), 30);
        } catch (Throwable th) {
            return wg0.i("audio manager error: ", th.getMessage());
        }
    }

    private final List<kpa> getAvailableDevices() {
        List availableCommunicationDevices = this.audioManager.getAvailableCommunicationDevices();
        ArrayList arrayList = new ArrayList();
        Iterator it = availableCommunicationDevices.iterator();
        while (it.hasNext()) {
            kpa kpaVarMapAndroidDeviceToCallsDevice = mapAndroidDeviceToCallsDevice((AudioDeviceInfo) it.next());
            if (kpaVarMapAndroidDeviceToCallsDevice != null) {
                arrayList.add(kpaVarMapAndroidDeviceToCallsDevice);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallsAudioDeviceInfo getDeviceForAndroidDevice(AudioDeviceInfo device) {
        Object next;
        Object next2;
        if (device == null) {
            this.logger.d(TAG, "NULL device mapped to null");
            return null;
        }
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (tpa.f(getAudioDeviceInfo((CallsAudioDeviceInfo) next), device)) {
                break;
            }
        }
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) next;
        if (callsAudioDeviceInfo == null) {
            this.logger.e(TAG, "Not having a mirror for current communication device");
            syncAudioDeviceList();
            Iterator<T> it2 = this.callsAudioDevices.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (tpa.f(getAudioDeviceInfo((CallsAudioDeviceInfo) next2), device)) {
                    break;
                }
            }
            callsAudioDeviceInfo = (CallsAudioDeviceInfo) next2;
        }
        if (callsAudioDeviceInfo == null) {
            this.logger.e(TAG, "After double-check still not having a mirror for current communication device");
            return null;
        }
        Logger logger = this.logger;
        int id = device.getId();
        int type = device.getType();
        CharSequence productName = device.getProductName();
        StringBuilder sbJ = wg0.j("Device ", id, ":", type, ":");
        sbJ.append((Object) productName);
        sbJ.append(" mirrored to ");
        sbJ.append(callsAudioDeviceInfo);
        logger.d(TAG, sbJ.toString());
        return callsAudioDeviceInfo;
    }

    private final boolean getHasEarpiece() {
        return firstOfType(CallsAudioManager.AudioDeviceType.EARPIECE) != null;
    }

    private final boolean getHasWiredHeadset() {
        return firstOfType(CallsAudioManager.AudioDeviceType.WIRED_HEADSET) != null;
    }

    private final CallsAudioDeviceInfo getPreferredAudioDevice(boolean bluetooth, boolean respectSpeakerEnabled) {
        maybeSyncAudioDeviceList();
        AudioDeviceSelector audioDeviceSelector = this.audioDeviceSelector;
        CallsAudioManager.State state = this.state;
        boolean hasWiredHeadset = getHasWiredHeadset();
        boolean hasEarpiece = getHasEarpiece();
        boolean z = this.disabledSpeakerOnce && !this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
        boolean z2 = this.disabledBluetoothOnce && !this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.BLUETOOTH);
        List<CallsAudioDeviceInfo> list = this.callsAudioDevices;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallsAudioDeviceInfo) it.next()).getDeviceType());
        }
        CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType = firstOfType(audioDeviceSelector.selectPreferableDevice(state, bluetooth, respectSpeakerEnabled, hasWiredHeadset, hasEarpiece, z, z2, x53.H0(arrayList), this.usedDevice.getDeviceType(), this.videoTracker, this.proximityTracker));
        return callsAudioDeviceInfoFirstOfType == null ? CallsAudioDeviceInfo.INSTANCE.getNONE() : callsAudioDeviceInfoFirstOfType;
    }

    public static /* synthetic */ CallsAudioDeviceInfo getPreferredAudioDevice$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return callsAudioManagerV3Impl.getPreferredAudioDevice(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCurrentCommunicationDevice(AudioDeviceInfo device) {
        CallsAudioDeviceInfo deviceForAndroidDevice = getDeviceForAndroidDevice(device);
        if (deviceForAndroidDevice == null) {
            return;
        }
        this.logger.d(TAG, "Apply device " + deviceForAndroidDevice + " confirmed by system");
        applyCurrentDevice(deviceForAndroidDevice);
    }

    private final kpa mapAndroidDeviceToCallsDevice(AudioDeviceInfo device) {
        CallsAudioDeviceInfo callsAudioDeviceInfo;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        int type = device.getType();
        if (type == 1) {
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
            CharSequence productName = device.getProductName();
            if (productName == null || (string = productName.toString()) == null) {
                string = CallsAudioDeviceInfo.EARPIECE;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType, string);
        } else if (type == 2) {
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            CharSequence productName2 = device.getProductName();
            if (productName2 == null || (string2 = productName2.toString()) == null) {
                string2 = CallsAudioDeviceInfo.SPEAKERPHONE;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType2, string2);
        } else if (type == 3) {
            CallsAudioManager.AudioDeviceType audioDeviceType3 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
            CharSequence productName3 = device.getProductName();
            if (productName3 == null || (string3 = productName3.toString()) == null) {
                string3 = CallsAudioDeviceInfo.WIRED_HEADSET;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType3, string3);
        } else if (type != 4) {
            String str = CallsAudioDeviceInfo.BLUETOOTH;
            if (type == 7) {
                CallsAudioManager.AudioDeviceType audioDeviceType4 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName4 = device.getProductName();
                if (productName4 != null && (string5 = productName4.toString()) != null) {
                    str = string5;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType4, str);
            } else if (type == 8) {
                CallsAudioManager.AudioDeviceType audioDeviceType5 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName5 = device.getProductName();
                if (productName5 != null && (string6 = productName5.toString()) != null) {
                    str = string6;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType5, str);
            } else if (type == 22) {
                CallsAudioManager.AudioDeviceType audioDeviceType6 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
                CharSequence productName6 = device.getProductName();
                if (productName6 == null || (string7 = productName6.toString()) == null) {
                    string7 = CallsAudioDeviceInfo.USB_HEADSET;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType6, string7);
            } else if (type != 26) {
                this.logger.d(TAG, "Unknown available audio device " + device.getType() + ":" + ((Object) device.getProductName()));
                callsAudioDeviceInfo = null;
            } else {
                CallsAudioManager.AudioDeviceType audioDeviceType7 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName7 = device.getProductName();
                if (productName7 != null && (string8 = productName7.toString()) != null) {
                    str = string8;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType7, str);
            }
        } else {
            CallsAudioManager.AudioDeviceType audioDeviceType8 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
            CharSequence productName8 = device.getProductName();
            if (productName8 == null || (string4 = productName8.toString()) == null) {
                string4 = CallsAudioDeviceInfo.WIRED_HEADPHONES;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType8, string4);
        }
        Logger logger = this.logger;
        int id = device.getId();
        int type2 = device.getType();
        CharSequence productName9 = device.getProductName();
        StringBuilder sbJ = wg0.j("Map ", id, ":", type2, ":");
        sbJ.append((Object) productName9);
        sbJ.append(" -> ");
        sbJ.append(callsAudioDeviceInfo);
        logger.d(TAG, sbJ.toString());
        if (callsAudioDeviceInfo != null) {
            return new kpa(callsAudioDeviceInfo, device);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeRecoverUtilizedDeviceType() {
        if (this.lastKnownAudioDeviceType == CallsAudioManager.AudioDeviceType.NONE) {
            this.logger.d(TAG, "Previously used device type is not known, will not try to recover");
        }
        if (this.usedDevice.getDeviceType() == this.lastKnownAudioDeviceType) {
            this.logger.d(TAG, "Used device type matches type of device used before audio focus was lost. Nothing to do here");
            return;
        }
        this.logger.d(TAG, "Schedule previously utilized device recovery in 3000 ms");
        try {
            this.workerThreadHandler.postDelayed(this.recoverDeviceByTypeRunnable, USED_DEVICE_RECOVER_TIMEOUT_MS);
        } catch (Throwable th) {
            this.logger.e(TAG, "Unable to post recovery runnable", th);
        }
    }

    private final void maybeSyncAudioDeviceList() {
        if (this.audioDeviceSyncCount > 0) {
            return;
        }
        syncAudioDeviceList();
    }

    private final void onCallStateChangedInternal(CallsAudioManager.State state) {
        if (this.isDestroyed) {
            return;
        }
        boolean z = this.state == CallsAudioManager.State.RINGING && state == CallsAudioManager.State.CONVERSATION;
        this.isInCall = state == CallsAudioManager.State.CONVERSATION;
        this.state = state;
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            release();
            return;
        }
        if (i == 2 || i == 3 || i == 4) {
            start();
            if (z) {
                updateAvailableDeviceList(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recoverDeviceByTypeRunnable$lambda$0(CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        try {
            callsAudioManagerV3Impl.recoverPreviouslyUtilizedDeviceType();
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "Error on device recovery", th);
        }
    }

    private final void recoverPreviouslyUtilizedDeviceType() {
        if (this.isDestroyed) {
            return;
        }
        if (this.usedDevice.getDeviceType() != this.lastKnownAudioDeviceType) {
            this.logger.d(TAG, "It seems previously used device has been recovered by system. Nothing to do here");
            return;
        }
        if (updateAvailableDeviceList$default(this, false, 1, null)) {
            this.logger.d(TAG, "It seems better option was found during device list update. Keep it as it is");
            return;
        }
        CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType = firstOfType(this.lastKnownAudioDeviceType);
        if (callsAudioDeviceInfoFirstOfType == null) {
            this.logger.d(TAG, "No device found by requested type " + this.lastKnownAudioDeviceType);
            return;
        }
        this.logger.d(TAG, "Submitting request to select " + callsAudioDeviceInfoFirstOfType + " as current (recovery)");
        selectAudioDevice(callsAudioDeviceInfoFirstOfType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release() {
        if (this.isDestroyed) {
            this.logger.d(TAG, "Already released, ignore");
            return;
        }
        this.isDestroyed = true;
        AudioManager audioManager = this.audioManager;
        audioManager.unregisterAudioDeviceCallback(this);
        try {
            audioManager.removeOnCommunicationDeviceChangedListener(m30.h(this));
        } catch (IllegalArgumentException unused) {
        }
        audioManager.clearCommunicationDevice();
        this.logger.d(TAG, "Audio manager cleanup completed");
        releaseAudioFocus();
        restorePreviousAudioState();
        this.backgroundHandlerThread.quit();
        this.logger.d(TAG, "Release completed");
    }

    private final void releaseAudioFocus() {
        this.audioFocusRequestHelper.releaseFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rememberUtilizedDeviceType() {
        cancelUtilizedDeviceTypeRecovery();
        this.lastKnownAudioDeviceType = this.usedDevice.getDeviceType();
    }

    private final void reportAudioDeviceOnMainThread(CallsAudioDeviceInfo device) {
        this.mainHandler.post(new f5(this, device, this.onAudioDeviceChangeListener, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportAudioDeviceOnMainThread$lambda$9(CallsAudioManagerV3Impl callsAudioManagerV3Impl, CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        if (!tpa.f(callsAudioManagerV3Impl.reportedAudioDevice, callsAudioDeviceInfo) && onAudioDeviceInfoChangeListener != null) {
            callsAudioManagerV3Impl.logger.v(TAG, "reporting device change " + callsAudioManagerV3Impl.reportedAudioDevice + " -> " + callsAudioDeviceInfo);
            onAudioDeviceInfoChangeListener.onAudioDeviceChanged(new CallsAudioManager.AudioDeviceInfoChangedEvent(callsAudioManagerV3Impl.reportedAudioDevice, callsAudioDeviceInfo));
            callsAudioManagerV3Impl.reportedAudioDevice = callsAudioDeviceInfo;
            return;
        }
        Logger logger = callsAudioManagerV3Impl.logger;
        CallsAudioDeviceInfo callsAudioDeviceInfo2 = callsAudioManagerV3Impl.reportedAudioDevice;
        logger.d(TAG, "Will not report audio device change from " + callsAudioDeviceInfo2 + " to " + callsAudioDeviceInfo + " because of same device=" + tpa.f(callsAudioDeviceInfo2, callsAudioDeviceInfo) + ", has listener=" + (onAudioDeviceInfoChangeListener != null));
    }

    private final void reportCurrentCallsAudioDevice(CallsAudioDeviceInfo device) {
        reportAudioDeviceOnMainThread(device);
        updateProximityTrackingState(device.getDeviceType() == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAudioFocus() {
        this.audioFocusRequestHelper.requestFocus();
    }

    private final void restorePreviousAudioState() {
        Object next;
        if (this.savedPreviousState) {
            this.logger.v(TAG, "restoring state");
            this.savedPreviousState = false;
            try {
                AudioManager audioManager = this.audioManager;
                if (this.savedIsSpeakerPhoneOn) {
                    Iterator it = audioManager.getAvailableCommunicationDevices().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((AudioDeviceInfo) next).getType() == 2) {
                                break;
                            }
                        }
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) next;
                    if (audioDeviceInfo != null) {
                        audioManager.setCommunicationDevice(audioDeviceInfo);
                    }
                }
                audioManager.setMicrophoneMute(this.savedIsMicrophoneMute);
            } catch (Exception e) {
                this.logger.e(TAG, "restorePreviousAudioState: failed", e);
            }
        }
    }

    private final void savePreviousState() {
        if (this.savedPreviousState) {
            return;
        }
        this.logger.v(TAG, "saving state");
        try {
            AudioManager audioManager = this.audioManager;
            this.savedIsMicrophoneMute = audioManager.isMicrophoneMute();
            AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
            boolean z = false;
            if (communicationDevice != null && communicationDevice.getType() == 2) {
                z = true;
            }
            this.savedIsSpeakerPhoneOn = z;
            this.savedPreviousState = true;
        } catch (Exception e) {
            this.logger.e(TAG, "savePreviousState: failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleSyncWithSystemCommunicationDevice() {
        if (this.isDestroyed) {
            return;
        }
        cancelScheduledSyncWithSystemCommunicationDevice();
        try {
            this.workerThreadHandler.postDelayed(this.syncWithSystemCommunicationDeviceRunnable, 2000L);
        } catch (Throwable th) {
            this.logger.d(TAG, "Can't schedule sync with system communication device", th);
        }
    }

    private final void scheduleTryToSetCommunicationDeviceAgain() {
        if (this.isDestroyed) {
            return;
        }
        cancelScheduledTrySetCommunicationDeviceAgain();
        this.logger.d(TAG, "Schedule try again with current device in 2000ms");
        try {
            this.workerThreadHandler.postDelayed(this.tryAgainRunnable, 2000L);
        } catch (Throwable th) {
            this.logger.e(TAG, "Unable to post try again runnable", th);
        }
    }

    private final void selectAudioDevice(CallsAudioDeviceInfo device) {
        cancelUtilizedDeviceTypeRecovery();
        this.logger.d(TAG, "Selecting " + device);
        if (tpa.f(this.usedDevice, device)) {
            this.logger.d(TAG, "An attempt to select same device " + this.usedDevice + ", ignore");
            return;
        }
        AudioDeviceInfo audioDeviceInfo = getAudioDeviceInfo(device);
        if (audioDeviceInfo == null) {
            this.logger.d(TAG, "No known android device matches requested device " + device);
            this.audioManager.clearCommunicationDevice();
            return;
        }
        if (device.getDeviceType() == CallsAudioManager.AudioDeviceType.NONE) {
            this.logger.d(TAG, "Empty device type, clear communication device");
            this.audioManager.clearCommunicationDevice();
            reportCurrentCallsAudioDevice(device);
            return;
        }
        if (audioDeviceInfo.equals(this.audioManager.getCommunicationDevice())) {
            this.logger.d(TAG, "Device " + device + " mapped to currently used communication device");
            handleCurrentCommunicationDevice(audioDeviceInfo);
            return;
        }
        this.logger.d(TAG, "Submit request to set current communication device to " + device);
        try {
            this.logger.d(TAG, "Apply device " + device + " by user request (just a promise to use)");
            applyCurrentDevice(device);
            if (setCommunicationDevice(audioDeviceInfo)) {
                return;
            }
            this.logger.d(TAG, "Can't set " + androidDeviceToString(audioDeviceInfo) + ": setCommunicationDevice() returned false");
            syncWithSystemCommunicationDevice();
        } catch (Throwable th) {
            this.logger.e(TAG, "Error setting communication device", new IllegalArgumentException("Proposed device was not able to set as current " + device + " (" + androidDeviceToString(audioDeviceInfo) + "), details: " + getAudioManagerStateDetails(), th));
            syncWithSystemCommunicationDevice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAudioDevice(CallsAudioDeviceInfo device) {
        CallsAudioManager.AudioDeviceType deviceType;
        if (this.isDestroyed || (deviceType = this.usedDevice.getDeviceType()) == device.getDeviceType()) {
            return;
        }
        boolean z = this.disabledBluetoothOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        this.disabledBluetoothOnce = z | (deviceType == audioDeviceType);
        boolean z2 = this.disabledSpeakerOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        this.disabledSpeakerOnce = z2 | (deviceType == audioDeviceType2);
        this.logger.d(TAG, "Set audio device by external request: " + device);
        if (device.oneOf$calls_audiomanager_release(audioDeviceType2, CallsAudioManager.AudioDeviceType.WIRED_HEADSET, CallsAudioManager.AudioDeviceType.EARPIECE, audioDeviceType)) {
            selectAudioDevice(device);
        }
    }

    private final void setAudioManagerModeSafe(int mode) {
        try {
            this.audioManager.setMode(mode);
        } catch (Throwable th) {
            this.logger.reportError(TAG, "Can't set audio manager mode", th);
        }
    }

    private final boolean setCommunicationDevice(AudioDeviceInfo device) {
        if (device == null) {
            this.audioManager.clearCommunicationDevice();
            return true;
        }
        if (!this.audioManager.setCommunicationDevice(device)) {
            return false;
        }
        scheduleTryToSetCommunicationDeviceAgain();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnAudioDeviceChangeListenerImpl(CallsAudioManager.OnAudioDeviceInfoChangeListener listener) {
        if (this.isDestroyed) {
            return;
        }
        this.onAudioDeviceChangeListener = listener;
        if (listener == null) {
            return;
        }
        this.reportedAudioDevice = NO_DEVICE;
        reportAudioDeviceOnMainThread(this.usedDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSpeakerEnabled(boolean enabled, boolean byVideoTurnedOn) {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(TAG, "requested speaker " + enabled + " (" + byVideoTurnedOn + ")");
        if (!enabled) {
            selectAudioDevice(getPreferredAudioDevice(true, false));
            return;
        }
        if (byVideoTurnedOn || !this.disabledSpeakerOnce || this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE)) {
            CallsAudioDeviceInfo callsAudioDeviceInfo = this.usedDevice;
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            if (callsAudioDeviceInfo.oneOf$calls_audiomanager_release(audioDeviceType, audioDeviceType2) && this.proximityTracker.getCanUseSpeaker()) {
                CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType = firstOfType(audioDeviceType2);
                if (callsAudioDeviceInfoFirstOfType != null) {
                    selectAudioDevice(callsAudioDeviceInfoFirstOfType);
                } else {
                    this.logger.e(TAG, "No speaker found");
                }
            }
        }
    }

    private final void start() {
        if (this.isStarted) {
            this.logger.d(TAG, "Already started, ignore");
            return;
        }
        this.logger.d(TAG, "Starting...");
        this.isStarted = true;
        savePreviousState();
        requestAudioFocus();
        startTrackingAudioDevices();
        setAudioManagerModeSafe(3);
        selectAudioDevice(getPreferredAudioDevice(true, false));
    }

    private final void startTrackingAudioDevices() {
        AudioManager audioManager = this.audioManager;
        audioManager.registerAudioDeviceCallback(this, this.workerThreadHandler);
        audioManager.addOnCommunicationDeviceChangedListener(new xq1(0, this), m30.h(this));
        updateAvailableDeviceList$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTrackingAudioDevices$lambda$4$lambda$3(CallsAudioManagerV3Impl callsAudioManagerV3Impl, Runnable runnable) {
        callsAudioManagerV3Impl.workerThreadHandler.post(runnable);
    }

    private final void syncAudioDeviceList() {
        this.logger.d(TAG, " Sync audio device list (" + this.audioDeviceSyncCount + "). List before update: " + x53.n0(this.callsAudioDevices, null, null, null, C00331.INSTANCE, 31));
        this.callsAudioDevices.clear();
        this.audioDeviceByCallsDevice.clear();
        try {
            List<kpa> availableDevices = getAvailableDevices();
            List<CallsAudioDeviceInfo> list = this.callsAudioDevices;
            ArrayList arrayList = new ArrayList(z53.S(availableDevices, 10));
            Iterator<T> it = availableDevices.iterator();
            while (it.hasNext()) {
                arrayList.add((CallsAudioDeviceInfo) ((kpa) it.next()).a);
            }
            list.addAll(arrayList);
            mz7.b0(availableDevices, this.audioDeviceByCallsDevice);
        } catch (Throwable th) {
            this.logger.e(TAG, "Error while getting available communication devices", th);
        }
        this.logger.d(TAG, " Sync audio device list (" + this.audioDeviceSyncCount + "). List after update: " + x53.n0(this.callsAudioDevices, null, null, null, C00343.INSTANCE, 31));
        this.audioDeviceSyncCount = this.audioDeviceSyncCount + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncWithSystemCommunicationDevice() {
        if (this.isDestroyed) {
            return;
        }
        this.logger.d(TAG, "Try to recover actual device audio device state");
        try {
            handleCurrentCommunicationDevice(this.audioManager.getCommunicationDevice());
        } catch (Throwable unused) {
            this.logger.e(TAG, "Can't recover current communication device from system state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trySetCommunicationDeviceAgain() {
        try {
            trySetCommunicationDeviceAgainUnsafe();
        } catch (Throwable th) {
            this.logger.e(TAG, "Failed to set communication device again", th);
            syncWithSystemCommunicationDevice();
        }
    }

    private final void trySetCommunicationDeviceAgainUnsafe() {
        if (this.isDestroyed) {
            return;
        }
        this.logger.d(TAG, "Try again with " + androidDeviceToString(getAudioDeviceInfo(this.usedDevice)));
        this.audioManager.clearCommunicationDevice();
        AudioDeviceInfo audioDeviceInfo = getAudioDeviceInfo(this.usedDevice);
        if (audioDeviceInfo == null) {
            this.logger.d(TAG, "No current device, ignore try again attempt, sync with system device instead");
            syncWithSystemCommunicationDevice();
            return;
        }
        if (this.audioManager.setCommunicationDevice(audioDeviceInfo)) {
            this.logger.d(TAG, "Try again with " + androidDeviceToString(audioDeviceInfo) + " passed, wait for a system confirmation or rollback in 2000ms");
            scheduleSyncWithSystemCommunicationDevice();
            return;
        }
        this.logger.d(TAG, "Try again with " + androidDeviceToString(audioDeviceInfo) + " did fail. Sync with system device immediately");
        syncWithSystemCommunicationDevice();
    }

    private final boolean updateAvailableDeviceList(boolean byStopRinging) {
        CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
        boolean z = firstOfType(audioDeviceType) != null;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        boolean z2 = firstOfType(audioDeviceType2) != null;
        this.logger.d(TAG, "update audio device list, had bt before=" + z2 + ", had headphones before=" + z);
        syncAudioDeviceList();
        Object obj = null;
        CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType = !z ? firstOfType(audioDeviceType) : null;
        CallsAudioDeviceInfo callsAudioDeviceInfoFirstOfType2 = !z2 ? firstOfType(audioDeviceType2) : null;
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (tpa.f((CallsAudioDeviceInfo) next, this.usedDevice)) {
                obj = next;
                break;
            }
        }
        if (obj == null || byStopRinging) {
            CallsAudioDeviceInfo preferredAudioDevice = getPreferredAudioDevice(true, !byStopRinging);
            this.logger.d(TAG, "Current device " + this.usedDevice + " disappeared, select " + preferredAudioDevice + " instead");
            selectAudioDevice(preferredAudioDevice);
        } else {
            if (callsAudioDeviceInfoFirstOfType != null && this.usedDevice.getDeviceType() != CallsAudioManager.AudioDeviceType.WIRED_HEADSET) {
                this.logger.d(TAG, "Wired headset did appear: " + callsAudioDeviceInfoFirstOfType + ", let us try to select it");
                selectAudioDevice(callsAudioDeviceInfoFirstOfType);
                return true;
            }
            if (callsAudioDeviceInfoFirstOfType2 != null && !this.usedDevice.getDeviceType().isHeadsetDevice()) {
                if (this.disabledBluetoothOnce && !this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.BLUETOOTH)) {
                    this.logger.d(TAG, "Will not try to select bluetooth because user disable it once already");
                    return true;
                }
                this.logger.d(TAG, "Bluetooth headset did appear: " + callsAudioDeviceInfoFirstOfType2 + ", let us try to select it");
                selectAudioDevice(callsAudioDeviceInfoFirstOfType2);
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean updateAvailableDeviceList$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return callsAudioManagerV3Impl.updateAvailableDeviceList(z);
    }

    private final void updateProximityTrackingState(boolean speakerOn) {
        boolean z = this.usedDevice.getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH || this.usedDevice.getDeviceType() == CallsAudioManager.AudioDeviceType.WIRED_HEADSET || (speakerOn && !this.trackProximityWhenSpeakerEnabled);
        this.logger.v(TAG, "proximity disabled? " + z + ", speaker? " + speakerOn);
        this.mainHandler.post(new u60(z, this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProximityTrackingState$lambda$10(boolean z, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        try {
            if (z) {
                callsAudioManagerV3Impl.proximityTracker.stopTrackingProximity();
            } else {
                callsAudioManagerV3Impl.proximityTracker.startTrackingProximity();
            }
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "Proximity tracker error", th);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void changeStateAsync(CallsAudioManager.State state, k56 onComplete, m56 onError) {
        doOnOwnThread("changeStateAsync", new C00201(state), onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public List<CallsAudioDeviceInfo> getAvailableAudioDevices() {
        return this.callsAudioDevices;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public CallsAudioDeviceInfo getCurrentDevice() {
        return this.usedDevice;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasBluetoothHeadsetAsync(m56 onSuccess, m56 onError) {
        doOnOwnThread("hasBluetoothHeadsetAsync", new C00221(onSuccess, this), null, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasWiredHeadsetAsync(m56 onSuccess, m56 onError) {
        doOnOwnThread("hasWiredHeadsetAsync", new C00231(onSuccess, this), null, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public boolean isHeadsetConnected() {
        return this.usedDevice.getDeviceType().isHeadsetDevice();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void notifyBluetoothPermissionGranted() {
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
        this.logger.d(TAG, "Audio devices were added, update list");
        updateAvailableDeviceList$default(this, false, 1, null);
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
        this.logger.d(TAG, "Audio devices were removed, update list");
        updateAvailableDeviceList$default(this, false, 1, null);
    }

    public void onCommunicationDeviceChanged(AudioDeviceInfo device) {
        doOnOwnThread$default(this, "onCommunicationDeviceChanged", new C00241(device), null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void releaseAsync(k56 onComplete, m56 onError) {
        doOnOwnThread("releaseAsync", new C00251(this), onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void requestAudioFocusAsync() {
        doOnOwnThread("requestAudioFocus", new C00261(this), new C00272(), new C00283());
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceAsync(CallsAudioDeviceInfo audioDevice, k56 onComplete, m56 onError) {
        doOnOwnThread("setAudioDeviceAsync", new C00291(audioDevice), onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceTypeAsync(CallsAudioManager.AudioDeviceType audioDevice, k56 onComplete, m56 onError) {
        doOnOwnThread("setAudioDeviceAsync", new C00301(audioDevice), onComplete, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setOnAudioDeviceChangeListener(CallsAudioManager.OnAudioDeviceInfoChangeListener listener) {
        doOnOwnThread$default(this, "setOnAudioDeviceChangeListener", new C00311(listener), null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setSpeakerEnabledAsync(boolean enabled, boolean byVideoTurnedOn, k56 onComplete, m56 onError) {
        doOnOwnThread("setSpeakerEnabledAsync", new C00321(enabled, byVideoTurnedOn), onComplete, onError);
    }
}
