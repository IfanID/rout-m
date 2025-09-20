package respawn.outbase.mixin.client

import net.minecraft.client.MinecraftClient
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(MinecraftClient::class)
class ExampleClientMixin {
    @Inject(at = [At("HEAD")], method = ["doAttack"])
    private fun init(info: CallbackInfo) {
        // This is an example client mixin.
        // It runs at the head of the doAttack method in MinecraftClient.
        // You can add your client-side mixin logic here.
        // println("ExampleClientMixin: doAttack called!") // For debugging
    }
}
