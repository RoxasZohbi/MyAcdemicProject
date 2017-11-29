using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using System.Threading.Tasks;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at http://go.microsoft.com/fwlink/?LinkId=234238

namespace E_Project_SevenWonders
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class MainPage : Page
    {
        
        public MainPage(Windows.ApplicationModel.Activation.SplashScreen splash)
        {
            this.InitializeComponent();
            this.img.SetValue(Canvas.TopProperty, splash.ImageLocation.Top);
            this.img.SetValue(Canvas.LeftProperty, splash.ImageLocation.Left);
            this.img.Width = 750;
            this.img.Height = 590;
            LoadingAnimation.Begin();
        }
        private async void Page_Loaded(object sender, RoutedEventArgs e)
        {
            await Task.Delay(7000);
            Window.Current.Content = new Home();
            Window.Current.Activate();
        }
    }
}
