package respawn.outbase.mixin

import net.minecraft.server.MinecraftServer
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(MinecraftServer::class)
class ExampleMixin {
    @Inject(at = [At("HEAD")], method = ["loadWorld"])
    private fun init(info: CallbackInfo) {
        // This is an example mixin.
        // It runs at the head of the loadWorld method in MinecraftServer.
        // You can add your mixin logic here.
        // println("ExampleMixin: loadWorld called!") // For debugging
    }
}
