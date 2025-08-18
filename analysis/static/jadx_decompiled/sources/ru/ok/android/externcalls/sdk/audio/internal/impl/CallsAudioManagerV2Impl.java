package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import defpackage.c;
import defpackage.e5f;
import defpackage.k56;
import defpackage.m56;
import defpackage.rd7;
import defpackage.tpa;
import defpackage.vq1;
import defpackage.x53;
import defpackage.z53;
import defpackage.z7;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u0000 ±\u00012\u00020\u00012\u00020\u0002:\u0002±\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b!\u0010\"J=\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0017¢\u0006\u0004\b%\u0010&J=\u0010(\u001a\u00020\u00162\u0006\u0010$\u001a\u00020'2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0017¢\u0006\u0004\b(\u0010)JE\u0010,\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0017¢\u0006\u0004\b,\u0010-J5\u0010.\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0017¢\u0006\u0004\b.\u0010/J7\u00101\u001a\u00020\u00162\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0017¢\u0006\u0004\b1\u00102J7\u00103\u001a\u00020\u00162\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0017¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u0010\u001eJ\u0019\u00108\u001a\u00020\u00162\b\b\u0002\u00105\u001a\u00020\u0007H\u0001¢\u0006\u0004\b6\u00107J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010<J\u001f\u0010@\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0001¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020\u0016H\u0001¢\u0006\u0004\bA\u0010\u001eJO\u0010H\u001a\u00020\u00162\u0006\u0010D\u001a\u00020C2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00182\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0001¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00162\u0006\u0010$\u001a\u00020'H\u0003¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0016H\u0003¢\u0006\u0004\bM\u0010\u001eJ\u0019\u0010N\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\bN\u0010\"J\u0017\u0010O\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\bO\u0010LJ\u0019\u0010Q\u001a\u00020\u00162\b\b\u0002\u0010P\u001a\u00020\u0007H\u0002¢\u0006\u0004\bQ\u00107J\u000f\u0010R\u001a\u00020\u0016H\u0002¢\u0006\u0004\bR\u0010\u001eJ\u000f\u0010S\u001a\u00020\u0016H\u0002¢\u0006\u0004\bS\u0010\u001eJ\u000f\u0010T\u001a\u00020\u0016H\u0003¢\u0006\u0004\bT\u0010\u001eJ\u0017\u0010W\u001a\u00020\u00162\u0006\u0010V\u001a\u00020UH\u0003¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0016H\u0003¢\u0006\u0004\bY\u0010\u001eJ\u000f\u0010Z\u001a\u00020\u0016H\u0003¢\u0006\u0004\bZ\u0010\u001eJ\u000f\u0010[\u001a\u00020\u0016H\u0003¢\u0006\u0004\b[\u0010\u001eJ\u000f\u0010\\\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\\\u0010\u001eJ\u0017\u0010^\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\u0007H\u0003¢\u0006\u0004\b^\u00107J\u000f\u0010_\u001a\u00020\u0007H\u0003¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0007H\u0003¢\u0006\u0004\ba\u0010`J\u0017\u0010b\u001a\u00020\u00162\u0006\u0010:\u001a\u00020'H\u0003¢\u0006\u0004\bb\u0010JJ\u0017\u0010B\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\u0007H\u0003¢\u0006\u0004\bB\u00107J\u000f\u0010d\u001a\u00020\u0016H\u0002¢\u0006\u0004\bd\u0010\u001eJ\u0017\u0010e\u001a\u00020\u00162\u0006\u0010:\u001a\u00020#H\u0003¢\u0006\u0004\be\u0010fJ#\u0010i\u001a\u00020'2\b\b\u0002\u0010g\u001a\u00020\u00072\b\b\u0002\u0010h\u001a\u00020\u0007H\u0003¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0016H\u0003¢\u0006\u0004\bk\u0010\u001eJ\u0017\u0010l\u001a\u00020#2\u0006\u0010:\u001a\u00020'H\u0003¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\u00162\u0006\u0010:\u001a\u00020#H\u0003¢\u0006\u0004\bn\u0010fJ\u0017\u0010o\u001a\u00020C2\u0006\u0010:\u001a\u00020'H\u0003¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\u00162\u0006\u0010q\u001a\u00020\u0007H\u0003¢\u0006\u0004\br\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010sR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010tR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010uR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010vR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010wR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010uR\u0019\u0010\u0089\u0001\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010uR\u0018\u0010\u008c\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010uR\u0018\u0010\u008d\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010uR\u0018\u0010\u008e\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010uR\u0016\u0010\u008f\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010uR\u0017\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u0090\u0001R \u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020#0\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0096\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009c\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010uR\u001e\u0010\u009d\u0001\u001a\u00020|8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010~\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¡\u0001\u001a\u00020#2\u0007\u0010 \u0001\u001a\u00020#8\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0095\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001e\u0010\u00ad\u0001\u001a\t\u0012\u0004\u0012\u00020#0ª\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010®\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010`R\u0015\u0010_\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010`R\u0015\u0010a\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010`¨\u0006²\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Listener;", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "proximityTracker", "", "trackProximityWhenSpeakerEnabled", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "audioDeviceSelector", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "onMuteListener", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/ProximityTracker;ZLru/ok/android/externcalls/sdk/audio/VideoTracker;Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "state", "Lkotlin/Function0;", "Le5f;", "onComplete", "Lkotlin/Function1;", "", "onError", "changeStateAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;Lk56;Lm56;)V", "notifyBluetoothPermissionGranted", "()V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "listener", "setOnAudioDeviceChangeListener", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "audioDevice", "setAudioDeviceAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "setAudioDeviceTypeAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;Lk56;Lm56;)V", "enabled", "byVideoTurnedOn", "setSpeakerEnabledAsync", "(ZZLk56;Lm56;)V", "releaseAsync", "(Lk56;Lm56;)V", "onSuccess", "hasWiredHeadsetAsync", "(Lm56;Lm56;)V", "hasBluetoothHeadsetAsync", "requestAudioFocusAsync", "withBluetooth", "selectPreferredAudioDevice$calls_audiomanager_release", "(Z)V", "selectPreferredAudioDevice", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;", "device", "onDeviceAvailable", "(Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;)Z", "onDeviceUnavailable", "setSpeakerEnabled$calls_audiomanager_release", "(ZZ)V", "setSpeakerEnabled", "updateAudioDeviceState$calls_audiomanager_release", "updateAudioDeviceState", "", "action", "block", "doOnOwnThread$calls_audiomanager_release", "(Ljava/lang/String;Lk56;Lm56;Lk56;)V", "doOnOwnThread", "setAudioDevice", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)V", "changeState", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;)V", "maybeRestartBluetoothManager", "setOnAudioDeviceChangeListenerImpl", "onCallStateChangedInternal", "byStopRinging", "autoSelectAudioDevice", "requestAudioFocus", "releaseAudioFocus", "release", "", "mode", "setAudioManagerModeSafe", "(I)V", "clearDeviceSelection", "startTrackingAudioDevices", "savePreviousState", "restorePreviousAudioState", "speakerOn", "updateProximityTrackingState", "hasBluetoothHeadset", "()Z", "hasWiredHeadset", "selectAudioDevice", "preferSelectedDevice", "applySelectedDevice", "reportAudioDeviceOnMainThread", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V", "bluetooth", "respectSpeakerEnabled", "getPreferredAudioDevice", "(ZZ)Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "updateAvailableAudioDevices", "getDeviceInfo", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "setAudioDeviceInternal", "getAudioDeviceReadableName", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Ljava/lang/String;", "isMute", "mute", "Landroid/content/Context;", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "Z", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "Landroid/os/HandlerThread;", "backgroundHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;", "bluetoothManager", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager;", "wiredHeadsetManager", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "savedPreviousState", "savedAudioMode", "I", "savedIsSpeakerPhoneOn", "savedIsMicrophoneMute", "disabledBluetoothOnce", "disabledSpeakerOnce", "hasEarpiece", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "", "audioDevices", "Ljava/util/Set;", "reportedAudioDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "selectedDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "bluetoothDeviceIntent", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;", "onAudioDeviceChangeListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "isDestroyed", "workerThreadHandler", "getWorkerThreadHandler$calls_audiomanager_release", "()Landroid/os/Handler;", "<set-?>", "currentDevice", "getCurrentDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner;", "bluetoothDeviceScanner", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner;", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "audioFocusRequestHelper", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "", "getAvailableAudioDevices", "()Ljava/util/List;", "availableAudioDevices", "isHeadsetConnected", "getHasBluetoothHeadset", "getHasWiredHeadset", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CallsAudioManagerV2Impl implements CallsAudioManager, CallsBluethoothDeviceScanner.Listener {
    private static final String LOG_TAG = "CallsAudioManagerV2";
    private final AudioDeviceSelector audioDeviceSelector;
    private volatile Set<CallsAudioDeviceInfo> audioDevices;
    private final AudioFocusRequestHelper audioFocusRequestHelper;
    private final AudioManager audioManager;
    private final HandlerThread backgroundHandlerThread;
    private CallsBluethoothDeviceScanner.BluetoothDeviceIntent bluetoothDeviceIntent;
    private final CallsBluethoothDeviceScanner bluetoothDeviceScanner;
    private final CallsBluetoothManager bluetoothManager;
    private final Context context;
    private volatile CallsAudioDeviceInfo currentDevice;
    private boolean disabledBluetoothOnce;
    private boolean disabledSpeakerOnce;
    private final boolean hasEarpiece;
    private volatile boolean isDestroyed;
    private final Logger logger;
    private final Handler mainHandler;
    private volatile CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceChangeListener;
    private final ProximityTracker proximityTracker;
    private CallsAudioDeviceInfo reportedAudioDevice;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private boolean savedPreviousState;
    private CallsAudioManager.AudioDeviceType selectedDevice;
    private CallsAudioManager.State state;
    private final boolean trackProximityWhenSpeakerEnabled;
    private final VideoTracker videoTracker;
    private final CallsWiredHeadsetManager wiredHeadsetManager;
    private final Handler workerThreadHandler;
    private static final CallsAudioDeviceInfo NO_DEVICE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$2, reason: invalid class name */
    public static final class AnonymousClass2 extends rd7 implements k56 {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.k56
        public final Boolean invoke() {
            return Boolean.valueOf(CallsAudioManagerV2Impl.this.isDestroyed);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[CallsAudioManager.AudioDeviceType.values().length];
            try {
                iArr2[CallsAudioManager.AudioDeviceType.BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.SPEAKER_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$changeStateAsync$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements k56 {
        final /* synthetic */ CallsAudioManager.State $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CallsAudioManager.State state) {
            super(0);
            this.$state = state;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m80invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m80invoke() {
            CallsAudioManagerV2Impl.this.changeState(this.$state);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$hasBluetoothHeadsetAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00101 extends rd7 implements k56 {
        final /* synthetic */ m56 $onSuccess;
        final /* synthetic */ CallsAudioManagerV2Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00101(m56 m56Var, CallsAudioManagerV2Impl callsAudioManagerV2Impl) {
            super(0);
            this.$onSuccess = m56Var;
            this.this$0 = callsAudioManagerV2Impl;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m81invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m81invoke() {
            this.$onSuccess.invoke(Boolean.valueOf(this.this$0.hasBluetoothHeadset()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$hasWiredHeadsetAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00111 extends rd7 implements k56 {
        final /* synthetic */ m56 $onSuccess;
        final /* synthetic */ CallsAudioManagerV2Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00111(m56 m56Var, CallsAudioManagerV2Impl callsAudioManagerV2Impl) {
            super(0);
            this.$onSuccess = m56Var;
            this.this$0 = callsAudioManagerV2Impl;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m82invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m82invoke() {
            this.$onSuccess.invoke(Boolean.valueOf(this.this$0.hasWiredHeadset()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$notifyBluetoothPermissionGranted$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00121 extends rd7 implements k56 {
        public C00121() {
            super(0);
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m83invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m83invoke() {
            CallsAudioManagerV2Impl.this.maybeRestartBluetoothManager();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$releaseAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00131 extends rd7 implements k56 {
        public C00131() {
            super(0);
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m84invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m84invoke() {
            CallsAudioManagerV2Impl.this.release();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$requestAudioFocusAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00141 extends rd7 implements k56 {
        public C00141() {
            super(0);
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m85invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m85invoke() {
            CallsAudioManagerV2Impl.this.logger.e(CallsAudioManagerV2Impl.LOG_TAG, "audio focus request done");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Le5f;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$requestAudioFocusAsync$2, reason: invalid class name and case insensitive filesystem */
    public static final class C00152 extends rd7 implements m56 {
        public C00152() {
            super(1);
        }

        @Override // defpackage.m56
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return e5f.a;
        }

        public final void invoke(Throwable th) {
            CallsAudioManagerV2Impl.this.logger.e(CallsAudioManagerV2Impl.LOG_TAG, "audio focus request failed", th);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$requestAudioFocusAsync$3, reason: invalid class name */
    public static final class AnonymousClass3 extends rd7 implements k56 {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m86invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m86invoke() {
            CallsAudioManagerV2Impl.this.requestAudioFocus();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setAudioDeviceAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00161 extends rd7 implements k56 {
        final /* synthetic */ CallsAudioDeviceInfo $audioDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00161(CallsAudioDeviceInfo callsAudioDeviceInfo) {
            super(0);
            this.$audioDevice = callsAudioDeviceInfo;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m87invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m87invoke() {
            CallsAudioManagerV2Impl.this.setAudioDevice(this.$audioDevice.getDeviceType());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setAudioDeviceTypeAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00171 extends rd7 implements k56 {
        final /* synthetic */ CallsAudioManager.AudioDeviceType $audioDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00171(CallsAudioManager.AudioDeviceType audioDeviceType) {
            super(0);
            this.$audioDevice = audioDeviceType;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m88invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m88invoke() {
            CallsAudioManagerV2Impl.this.setAudioDevice(this.$audioDevice);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setOnAudioDeviceChangeListener$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00181 extends rd7 implements k56 {
        final /* synthetic */ CallsAudioManager.OnAudioDeviceInfoChangeListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00181(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
            super(0);
            this.$listener = onAudioDeviceInfoChangeListener;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m89invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m89invoke() {
            CallsAudioManagerV2Impl.this.setOnAudioDeviceChangeListenerImpl(this.$listener);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setSpeakerEnabledAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00191 extends rd7 implements k56 {
        final /* synthetic */ boolean $byVideoTurnedOn;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00191(boolean z, boolean z2) {
            super(0);
            this.$enabled = z;
            this.$byVideoTurnedOn = z2;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m90invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m90invoke() {
            CallsAudioManagerV2Impl.this.setSpeakerEnabled$calls_audiomanager_release(this.$enabled, this.$byVideoTurnedOn);
        }
    }

    public CallsAudioManagerV2Impl(Context context, ProximityTracker proximityTracker, boolean z, VideoTracker videoTracker, AudioDeviceSelector audioDeviceSelector, CallsAudioManager.OnMuteListener onMuteListener, Logger logger) {
        this.context = context;
        this.proximityTracker = proximityTracker;
        this.trackProximityWhenSpeakerEnabled = z;
        this.videoTracker = videoTracker;
        this.audioDeviceSelector = audioDeviceSelector;
        this.logger = logger;
        HandlerThread handlerThread = new HandlerThread("CallsAudioManagerThread");
        this.backgroundHandlerThread = handlerThread;
        this.state = CallsAudioManager.State.IDLE;
        this.audioDevices = new LinkedHashSet();
        CallsAudioDeviceInfo callsAudioDeviceInfo = NO_DEVICE;
        this.reportedAudioDevice = callsAudioDeviceInfo;
        this.selectedDevice = CallsAudioManager.AudioDeviceType.NONE;
        this.currentDevice = callsAudioDeviceInfo;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.workerThreadHandler = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.mainHandler = handler2;
        this.bluetoothManager = new CallsBluetoothManager(context, this, logger);
        this.wiredHeadsetManager = new CallsWiredHeadsetManager(context, this, logger);
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.audioManager = audioManager;
        CallsBluethoothDeviceScanner callsBluethoothDeviceScanner = new CallsBluethoothDeviceScanner(handler, this);
        callsBluethoothDeviceScanner.start(audioManager);
        this.bluetoothDeviceScanner = callsBluethoothDeviceScanner;
        this.hasEarpiece = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        this.audioFocusRequestHelper = new AudioFocusRequestHelper(audioManager, onMuteListener, handler2, handler, new AnonymousClass2(), logger, null, null, 192, null);
        logger.v(LOG_TAG, "CAM is created");
    }

    private final void applySelectedDevice() {
        CallsAudioDeviceInfo deviceInfo = getDeviceInfo(this.selectedDevice);
        reportAudioDeviceOnMainThread(deviceInfo);
        if (tpa.f(getCurrentDevice(), deviceInfo)) {
            return;
        }
        setAudioDeviceInternal(deviceInfo);
    }

    private final void autoSelectAudioDevice(boolean byStopRinging) {
        selectAudioDevice(getPreferredAudioDevice(true, !byStopRinging));
    }

    public static /* synthetic */ void autoSelectAudioDevice$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        callsAudioManagerV2Impl.autoSelectAudioDevice(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeState(CallsAudioManager.State state) {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(LOG_TAG, "requested " + state);
        onCallStateChangedInternal(state);
    }

    private final void clearDeviceSelection() {
        this.logger.v(LOG_TAG, "clearing device");
        this.currentDevice = NO_DEVICE;
        this.selectedDevice = CallsAudioManager.AudioDeviceType.NONE;
        this.audioDevices.clear();
    }

    public static /* synthetic */ void doOnOwnThread$calls_audiomanager_release$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, String str, k56 k56Var, m56 m56Var, k56 k56Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            k56Var = null;
        }
        if ((i & 4) != 0) {
            m56Var = null;
        }
        callsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release(str, k56Var, m56Var, k56Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doOnOwnThread$lambda$8(CallsAudioManagerV2Impl callsAudioManagerV2Impl, k56 k56Var, k56 k56Var2, String str, m56 m56Var) {
        if (callsAudioManagerV2Impl.isDestroyed) {
            return;
        }
        try {
            k56Var.invoke();
            if (k56Var2 != null) {
                k56Var2.invoke();
            }
        } catch (Throwable th) {
            callsAudioManagerV2Impl.logger.e(LOG_TAG, "Error executing an action ".concat(str), th);
            if (m56Var != null) {
                m56Var.invoke(th);
            }
        }
    }

    private final String getAudioDeviceReadableName(CallsAudioManager.AudioDeviceType device) {
        String name;
        int i = WhenMappings.$EnumSwitchMapping$1[device.ordinal()];
        if (i == 1) {
            return this.bluetoothManager.getConnectedDeviceName();
        }
        if (i == 2) {
            return this.wiredHeadsetManager.getConnectedDeviceName();
        }
        if (i == 3) {
            return CallsAudioDeviceInfo.EARPIECE;
        }
        if (i == 4) {
            return CallsAudioDeviceInfo.SPEAKERPHONE;
        }
        if (i != 5) {
            return "";
        }
        CallsBluethoothDeviceScanner.BluetoothDeviceIntent bluetoothDeviceIntent = this.bluetoothDeviceIntent;
        return (bluetoothDeviceIntent == null || (name = bluetoothDeviceIntent.getName()) == null) ? CallsAudioDeviceInfo.BLUETOOTH : name;
    }

    private final CallsAudioDeviceInfo getDeviceInfo(CallsAudioManager.AudioDeviceType device) {
        return new CallsAudioDeviceInfo(device, getAudioDeviceReadableName(device));
    }

    private final boolean getHasBluetoothHeadset() {
        return this.bluetoothManager.getHasBluetoothHeadset();
    }

    private final boolean getHasWiredHeadset() {
        return this.wiredHeadsetManager.isWiredHeadsetPlugged();
    }

    private final CallsAudioManager.AudioDeviceType getPreferredAudioDevice(boolean bluetooth, boolean respectSpeakerEnabled) {
        AudioDeviceSelector audioDeviceSelector = this.audioDeviceSelector;
        CallsAudioManager.State state = this.state;
        boolean hasWiredHeadset = getHasWiredHeadset();
        boolean z = this.hasEarpiece;
        boolean z2 = this.disabledSpeakerOnce;
        boolean z3 = this.disabledBluetoothOnce;
        Set<CallsAudioDeviceInfo> set = this.audioDevices;
        ArrayList arrayList = new ArrayList(z53.S(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallsAudioDeviceInfo) it.next()).getDeviceType());
        }
        return audioDeviceSelector.selectPreferableDevice(state, bluetooth, respectSpeakerEnabled, hasWiredHeadset, z, z2, z3, x53.H0(arrayList), getCurrentDevice().getDeviceType(), this.videoTracker, this.proximityTracker);
    }

    public static /* synthetic */ CallsAudioManager.AudioDeviceType getPreferredAudioDevice$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return callsAudioManagerV2Impl.getPreferredAudioDevice(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasBluetoothHeadset() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        return (Build.VERSION.SDK_INT < 31 || z7.c(this.context, "android.permission.BLUETOOTH_CONNECT") == 0) && defaultAdapter.getProfileConnectionState(1) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasWiredHeadset() {
        return this.wiredHeadsetManager.isWiredHeadsetPlugged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeRestartBluetoothManager() {
        if (this.isDestroyed) {
            return;
        }
        this.bluetoothManager.start();
    }

    private final void mute(boolean isMute) {
    }

    private final void onCallStateChangedInternal(CallsAudioManager.State state) {
        if (this.isDestroyed) {
            return;
        }
        boolean z = this.state == CallsAudioManager.State.RINGING && state == CallsAudioManager.State.CONVERSATION;
        this.state = state;
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            release();
            return;
        }
        if (i == 2 || i == 3 || i == 4) {
            if (this.audioManager.getMode() != 3) {
                savePreviousState();
                requestAudioFocus();
                startTrackingAudioDevices();
                autoSelectAudioDevice$default(this, false, 1, null);
                setAudioManagerModeSafe(3);
            }
            if (z) {
                autoSelectAudioDevice(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release() {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(LOG_TAG, "release CAM");
        this.isDestroyed = true;
        this.proximityTracker.stopTrackingProximity();
        this.wiredHeadsetManager.stop();
        this.bluetoothManager.stop();
        this.bluetoothDeviceScanner.stop();
        clearDeviceSelection();
        restorePreviousAudioState();
        releaseAudioFocus();
        this.backgroundHandlerThread.quitSafely();
    }

    private final void releaseAudioFocus() {
        this.audioFocusRequestHelper.releaseFocus();
    }

    private final void reportAudioDeviceOnMainThread(CallsAudioDeviceInfo device) {
        this.mainHandler.post(new c(this, 18, device));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportAudioDeviceOnMainThread$lambda$4(CallsAudioManagerV2Impl callsAudioManagerV2Impl, CallsAudioDeviceInfo callsAudioDeviceInfo) {
        CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener = callsAudioManagerV2Impl.onAudioDeviceChangeListener;
        if (tpa.f(callsAudioManagerV2Impl.reportedAudioDevice, callsAudioDeviceInfo) || onAudioDeviceInfoChangeListener == null) {
            return;
        }
        callsAudioManagerV2Impl.logger.v(LOG_TAG, "reporting device change " + callsAudioManagerV2Impl.reportedAudioDevice + " -> " + callsAudioDeviceInfo);
        onAudioDeviceInfoChangeListener.onAudioDeviceChanged(new CallsAudioManager.AudioDeviceInfoChangedEvent(callsAudioManagerV2Impl.reportedAudioDevice, callsAudioDeviceInfo));
        callsAudioManagerV2Impl.reportedAudioDevice = callsAudioDeviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAudioFocus() {
        this.audioFocusRequestHelper.requestFocus();
    }

    private final void restorePreviousAudioState() {
        if (this.savedPreviousState) {
            this.logger.v(LOG_TAG, "restoring state");
            this.savedPreviousState = false;
            try {
                AudioManager audioManager = this.audioManager;
                audioManager.setMode(this.savedAudioMode);
                audioManager.setSpeakerphoneOn(this.savedIsSpeakerPhoneOn);
                audioManager.setMicrophoneMute(this.savedIsMicrophoneMute);
            } catch (Exception e) {
                this.logger.reportError(LOG_TAG, "restorePreviousAudioState: failed", e);
            }
        }
    }

    private final void savePreviousState() {
        if (this.savedPreviousState) {
            return;
        }
        this.logger.v(LOG_TAG, "saving state");
        try {
            AudioManager audioManager = this.audioManager;
            this.savedAudioMode = audioManager.getMode();
            this.savedIsSpeakerPhoneOn = audioManager.isSpeakerphoneOn();
            this.savedIsMicrophoneMute = audioManager.isMicrophoneMute();
            this.savedPreviousState = true;
        } catch (Exception e) {
            this.logger.reportError(LOG_TAG, "savePreviousState: failed", e);
        }
    }

    private final void selectAudioDevice(CallsAudioManager.AudioDeviceType device) {
        Object next;
        if (device == CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT) {
            this.logger.e(LOG_TAG, "device " + device + " can never be selected. use it as trigger for permission request");
            return;
        }
        this.logger.v(LOG_TAG, "selecting " + device);
        Iterator<T> it = this.audioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CallsAudioDeviceInfo) next).getDeviceType() == device) {
                    break;
                }
            }
        }
        if (next == null) {
            this.logger.e(LOG_TAG, "can't select " + device + " from available " + this.audioDevices);
        }
        this.selectedDevice = device;
        updateAudioDeviceState(true);
    }

    public static /* synthetic */ void selectPreferredAudioDevice$calls_audiomanager_release$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        callsAudioManagerV2Impl.selectPreferredAudioDevice$calls_audiomanager_release(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAudioDevice(CallsAudioManager.AudioDeviceType audioDevice) {
        CallsAudioManager.AudioDeviceType deviceType;
        this.logger.v(LOG_TAG, "requested " + audioDevice);
        if (this.isDestroyed || audioDevice == (deviceType = getCurrentDevice().getDeviceType())) {
            return;
        }
        boolean z = this.disabledBluetoothOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        this.disabledBluetoothOnce = z | (deviceType == audioDeviceType);
        boolean z2 = this.disabledSpeakerOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        this.disabledSpeakerOnce = z2 | (deviceType == audioDeviceType2);
        CallsAudioManager.AudioDeviceType audioDeviceType3 = CallsAudioManager.AudioDeviceType.NONE;
        if (deviceType == audioDeviceType3) {
            mute(false);
        }
        if (audioDevice.oneOf(audioDeviceType2, CallsAudioManager.AudioDeviceType.WIRED_HEADSET, CallsAudioManager.AudioDeviceType.EARPIECE, audioDeviceType)) {
            selectAudioDevice(audioDevice);
        }
        if (audioDevice == audioDeviceType3) {
            mute(true);
        }
    }

    private final void setAudioDeviceInternal(CallsAudioDeviceInfo device) {
        this.logger.v(LOG_TAG, "Setting " + device);
        if (this.isDestroyed) {
            return;
        }
        this.currentDevice = device;
        boolean z = device.getDeviceType() == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        AudioManager audioManager = this.audioManager;
        if (audioManager.isSpeakerphoneOn() != z) {
            audioManager.setSpeakerphoneOn(z);
        }
        updateProximityTrackingState(z);
    }

    private final void setAudioManagerModeSafe(int mode) {
        try {
            this.audioManager.setMode(mode);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't set audio manager mode", th);
        }
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
        reportAudioDeviceOnMainThread(getCurrentDevice());
    }

    private final void startTrackingAudioDevices() {
        this.logger.v(LOG_TAG, "start tracking devices");
        clearDeviceSelection();
        this.wiredHeadsetManager.start();
        this.bluetoothManager.start();
        updateAudioDeviceState(false);
    }

    private final void updateAudioDeviceState(boolean preferSelectedDevice) {
        CallsAudioManager.AudioDeviceType audioDeviceType;
        this.logger.v(LOG_TAG, "Updating device, prefer selection is " + preferSelectedDevice + "...");
        boolean hasBluetoothHeadset = this.bluetoothManager.getHasBluetoothHeadset();
        CallsAudioManager.AudioDeviceType deviceType = getCurrentDevice().getDeviceType();
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        if (deviceType == audioDeviceType2 && !hasBluetoothHeadset) {
            this.logger.v(LOG_TAG, "BT is down, reselect");
            this.selectedDevice = getPreferredAudioDevice(false, false);
        }
        if (hasBluetoothHeadset && !preferSelectedDevice && (audioDeviceType = this.selectedDevice) != audioDeviceType2 && audioDeviceType != CallsAudioManager.AudioDeviceType.WIRED_HEADSET && !this.disabledBluetoothOnce) {
            this.logger.v(LOG_TAG, "suddenly, BT. " + audioDeviceType + " -> " + audioDeviceType2);
            this.selectedDevice = audioDeviceType2;
        }
        updateAvailableAudioDevices();
        this.logger.v(LOG_TAG, "current selected device is " + this.selectedDevice);
        CallsAudioManager.AudioDeviceType audioDeviceType3 = this.selectedDevice;
        if (audioDeviceType3 == audioDeviceType2) {
            if (!this.bluetoothManager.isBluetoothOn() && !this.bluetoothManager.startScoAudio()) {
                CallsAudioManager.AudioDeviceType preferredAudioDevice = getPreferredAudioDevice(false, true);
                this.selectedDevice = preferredAudioDevice;
                this.logger.e(LOG_TAG, "failed to start bluetooth, so selected other preferred device: " + preferredAudioDevice);
            }
        } else if (audioDeviceType3 != CallsAudioManager.AudioDeviceType.NONE) {
            this.bluetoothManager.stopScoAudio();
        }
        applySelectedDevice();
    }

    private final void updateAvailableAudioDevices() {
        this.logger.v(LOG_TAG, "updating available devices");
        EnumSet enumSetNoneOf = EnumSet.noneOf(CallsAudioManager.AudioDeviceType.class);
        if (getHasBluetoothHeadset()) {
            enumSetNoneOf.add(CallsAudioManager.AudioDeviceType.BLUETOOTH);
        } else if (this.bluetoothDeviceIntent != null) {
            enumSetNoneOf.add(CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT);
        }
        if (getHasWiredHeadset()) {
            enumSetNoneOf.add(CallsAudioManager.AudioDeviceType.WIRED_HEADSET);
        } else if (this.hasEarpiece) {
            enumSetNoneOf.add(CallsAudioManager.AudioDeviceType.EARPIECE);
        }
        enumSetNoneOf.add(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
        ArrayList arrayList = new ArrayList(z53.S(enumSetNoneOf, 10));
        Iterator it = enumSetNoneOf.iterator();
        while (it.hasNext()) {
            arrayList.add(getDeviceInfo((CallsAudioManager.AudioDeviceType) it.next()));
        }
        this.audioDevices = x53.G0(arrayList);
        this.logger.v(LOG_TAG, "updated devices: " + enumSetNoneOf);
    }

    private final void updateProximityTrackingState(boolean speakerOn) {
        boolean z = getCurrentDevice().getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH || getHasWiredHeadset() || (speakerOn && !this.trackProximityWhenSpeakerEnabled);
        this.logger.v(LOG_TAG, "proximity disabled? " + z + ", speaker? " + speakerOn);
        if (z) {
            this.proximityTracker.stopTrackingProximity();
        } else {
            this.proximityTracker.startTrackingProximity();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void changeStateAsync(CallsAudioManager.State state, k56 onComplete, m56 onError) {
        doOnOwnThread$calls_audiomanager_release("changeState", onComplete, onError, new AnonymousClass1(state));
    }

    public final void doOnOwnThread$calls_audiomanager_release(String action, k56 onComplete, m56 onError, k56 block) {
        if (this.isDestroyed) {
            return;
        }
        this.workerThreadHandler.post(new vq1(this, block, onComplete, action, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public List<CallsAudioDeviceInfo> getAvailableAudioDevices() {
        return x53.D0(this.audioDevices);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public CallsAudioDeviceInfo getCurrentDevice() {
        return this.currentDevice;
    }

    /* renamed from: getWorkerThreadHandler$calls_audiomanager_release, reason: from getter */
    public final Handler getWorkerThreadHandler() {
        return this.workerThreadHandler;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasBluetoothHeadsetAsync(m56 onSuccess, m56 onError) {
        doOnOwnThread$calls_audiomanager_release$default(this, "hasBluetoothHeadset", null, onError, new C00101(onSuccess, this), 2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasWiredHeadsetAsync(m56 onSuccess, m56 onError) {
        doOnOwnThread$calls_audiomanager_release$default(this, "hasWiredHeadset", null, onError, new C00111(onSuccess, this), 2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public boolean isHeadsetConnected() {
        return getCurrentDevice().getDeviceType().isHeadsetDevice();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void notifyBluetoothPermissionGranted() {
        doOnOwnThread$calls_audiomanager_release$default(this, "refreshPermissions", null, null, new C00121(), 6, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner.Listener
    public boolean onDeviceAvailable(CallsBluethoothDeviceScanner.BluetoothDeviceIntent device) {
        this.logger.d(LOG_TAG, "Bluetooth device added: " + device);
        this.bluetoothDeviceIntent = device;
        updateAvailableAudioDevices();
        return true;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner.Listener
    public boolean onDeviceUnavailable(CallsBluethoothDeviceScanner.BluetoothDeviceIntent device) {
        this.logger.d(LOG_TAG, "Bluetooth device removed: " + device);
        CallsBluethoothDeviceScanner.BluetoothDeviceIntent bluetoothDeviceIntent = this.bluetoothDeviceIntent;
        if (bluetoothDeviceIntent == null || device.getId() != bluetoothDeviceIntent.getId()) {
            return false;
        }
        this.bluetoothDeviceIntent = null;
        updateAvailableAudioDevices();
        return true;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void releaseAsync(k56 onComplete, m56 onError) {
        doOnOwnThread$calls_audiomanager_release("release", onComplete, onError, new C00131());
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void requestAudioFocusAsync() {
        doOnOwnThread$calls_audiomanager_release("requestAudioFocus", new C00141(), new C00152(), new AnonymousClass3());
    }

    public final void selectPreferredAudioDevice$calls_audiomanager_release(boolean withBluetooth) {
        selectAudioDevice(getPreferredAudioDevice(withBluetooth, true));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceAsync(CallsAudioDeviceInfo audioDevice, k56 onComplete, m56 onError) {
        doOnOwnThread$calls_audiomanager_release("setAudioDevice", onComplete, onError, new C00161(audioDevice));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceTypeAsync(CallsAudioManager.AudioDeviceType audioDevice, k56 onComplete, m56 onError) {
        doOnOwnThread$calls_audiomanager_release("setAudioDevice", onComplete, onError, new C00171(audioDevice));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setOnAudioDeviceChangeListener(CallsAudioManager.OnAudioDeviceInfoChangeListener listener) {
        doOnOwnThread$calls_audiomanager_release$default(this, "setOnAudioDeviceChangeListener", null, null, new C00181(listener), 6, null);
    }

    public final void setSpeakerEnabled$calls_audiomanager_release(boolean enabled, boolean byVideoTurnedOn) {
        this.logger.v(LOG_TAG, "requested speaker " + enabled + " (" + byVideoTurnedOn + ")");
        if (this.isDestroyed) {
            return;
        }
        if (enabled && (byVideoTurnedOn || !this.disabledSpeakerOnce)) {
            CallsAudioDeviceInfo currentDevice = getCurrentDevice();
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            if (currentDevice.oneOf$calls_audiomanager_release(audioDeviceType, audioDeviceType2) && this.proximityTracker.getCanUseSpeaker()) {
                selectAudioDevice(audioDeviceType2);
                return;
            }
        }
        selectAudioDevice(getPreferredAudioDevice(true, false));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setSpeakerEnabledAsync(boolean enabled, boolean byVideoTurnedOn, k56 onComplete, m56 onError) {
        doOnOwnThread$calls_audiomanager_release("setSpeakerEnabled", onComplete, onError, new C00191(enabled, byVideoTurnedOn));
    }

    public final void updateAudioDeviceState$calls_audiomanager_release() {
        updateAudioDeviceState(false);
    }
}
