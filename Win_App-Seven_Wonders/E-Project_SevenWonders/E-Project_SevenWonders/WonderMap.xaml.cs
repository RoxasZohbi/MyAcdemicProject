using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Devices.Geolocation;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Media.Imaging;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at http://go.microsoft.com/fwlink/?LinkId=234238

namespace E_Project_SevenWonders
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class WonderMap : Page
    {
        public WonderMap()
        {
            this.InitializeComponent();
            RingAnimation.Begin();
        }

        
        private void SearchBox_QuerySubmitted(SearchBox sender, SearchBoxQuerySubmittedEventArgs args)
        {
            if (!string.IsNullOrEmpty(args.QueryText))
            {
                string query = args.QueryText.ToLower();
                foreach (string sample in won)
                {
                    string item = sample.ToLower();
                    if (item.Contains(query))
                    {
                        if (item.Equals(won[0].ToLower()))
                        {
                            Window.Current.Content = new Aurora();
                        }
                        else if (item.Equals(won[1].ToLower()))
                        {
                            Window.Current.Content = new GrandCanyon();
                        }
                        else if (item.Equals(won[2].ToLower()))
                        {
                            Window.Current.Content = new GreatBarrierReef();
                        }
                        else if (item.Equals(won[3].ToLower()))
                        {
                            Window.Current.Content = new Harbor();
                        }
                        else if (item.Equals(won[4].ToLower()))
                        {
                            Window.Current.Content = new MountEve();
                        }
                        else if (item.Equals(won[5].ToLower()))
                        {
                            Window.Current.Content = new Paricutin();
                        }
                        else if (item.Equals(won[6].ToLower()))
                        {
                            Window.Current.Content = new VictoriaFall();
                        }
                        else if (item.Equals(won[7].ToLower()))
                        {
                            Window.Current.Content = new WallChina();
                        }
                        else if (item.Equals(won[8].ToLower()))
                        {
                            Window.Current.Content = new Petra();
                        }
                        else if (item.Equals(won[9].ToLower()))
                        {
                            Window.Current.Content = new Redeemer();
                        }
                        else if (item.Equals(won[10].ToLower()))
                        {
                            Window.Current.Content = new MachuPicchu();
                        }
                        else if (item.Equals(won[11].ToLower()))
                        {
                            Window.Current.Content = new ChichenItza();
                        }
                        else if (item.Equals(won[12].ToLower()))
                        {
                            Window.Current.Content = new Colosseum();
                        }
                        else if (item.Equals(won[13].ToLower()))
                        {
                            Window.Current.Content = new TajMahal();
                        }
                        else if (item.Equals(won[14].ToLower()))
                        {
                            Window.Current.Content = new IguazuFalls();
                        }
                        else if (item.Equals(won[15].ToLower()))
                        {
                            Window.Current.Content = new HaLong();
                        }
                        else if (item.Equals(won[16].ToLower()))
                        {
                            Window.Current.Content = new JejuIsland();
                        }
                        else if (item.Equals(won[17].ToLower()))
                        {
                            Window.Current.Content = new NationalPark();
                        }
                        else if (item.Equals(won[18].ToLower()))
                        {
                            Window.Current.Content = new TableMountain();
                        }
                        else if (item.Equals(won[19].ToLower()))
                        {
                            Window.Current.Content = new Komodo();
                        }
                        else if (item.Equals(won[20].ToLower()))
                        {
                            Window.Current.Content = new AmazonRainforest();
                        }
                        else if (item.Equals(won[21].ToLower()))
                        {
                            Window.Current.Content = new Durban();
                        }
                        else if (item.Equals(won[22].ToLower()))
                        {
                            Window.Current.Content = new Vigan();
                        }
                        else if (item.Equals(won[23].ToLower()))
                        {
                            Window.Current.Content = new Havana();
                        }
                        else if (item.Equals(won[24].ToLower()))
                        {
                            Window.Current.Content = new KualaLumpur();
                        }
                        else if (item.Equals(won[25].ToLower()))
                        {
                            Window.Current.Content = new Beirut();
                        }
                        else if (item.Equals(won[26].ToLower()))
                        {
                            Window.Current.Content = new Doha();
                        }
                        else if (item.Equals(won[27].ToLower()))
                        {
                            Window.Current.Content = new LaPaz();
                        }
                        else if (item.Equals(won[28].ToLower()))
                        {
                            Window.Current.Content = new Palau();
                        }
                        else if (item.Equals(won[29].ToLower()))
                        {
                            Window.Current.Content = new BelizeBarrierReef();
                        }
                        else if (item.Equals(won[30].ToLower()))
                        {
                            Window.Current.Content = new HydrothermalVent();
                        }
                        else if (item.Equals(won[31].ToLower()))
                        {
                            Window.Current.Content = new GalápagosIslands();
                        }
                        else if (item.Equals(won[32].ToLower()))
                        {
                            Window.Current.Content = new LakeBaikal();
                        }
                        else if (item.Equals(won[33].ToLower()))
                        {
                            Window.Current.Content = new RedSea();
                        }
                        Window.Current.Activate();
                        break;

                    }
                }
            }
        }

        private void SearchBox_SuggestionsRequested(SearchBox sender, SearchBoxSuggestionsRequestedEventArgs args)
        {
            if (!string.IsNullOrEmpty(args.QueryText))
            {
                foreach (string item in won)
                {
                    if (item.StartsWith(args.QueryText, StringComparison.CurrentCultureIgnoreCase))
                    {
                        args.Request.SearchSuggestionCollection.AppendQuerySuggestion(item);
                    }
                }
            }
        }

        List<string> won = new List<string> { "Aurora", "Grand Canyon", "Great Barrier Reef", "Harbor of Rio de Janeiro", "Mount Everest", "Parícutin Volcano", "Victoria Falls", "Great Wall of China", "Petra", "Machu Picchu", "Christ the Redeemer", "Chichen Itza", "Colosseum", "Taj Mahal", "Iguazu Falls", "Hạ Long", "Jeju Island", "Puerto Princesa Underground River", "Table Mountain", "Komodo", "Amazon rainforest", "Durban", "Vigan", "Havana", "Kuala Lumpur", "Beirut", "Doha", "La Paz", "Palau", "Belize Barrier Reef", "Deep-Sea Vents", "Galápagos Islands", "Lake Baikal", "Northern Red Sea" };

        private void StackPanel_PointerEntered(object sender, PointerRoutedEventArgs e)
        {
            if (sender.Equals(home))
            {
                HomeAnimation.Begin();
            }
            else if (sender.Equals(wonders))
            {
                WonderAnimation.Begin();
            }
            else if (sender.Equals(maps))
            {
                MapsAnimation.Begin();
            }

        }

        private void textBlock_PointerPressed(object sender, PointerRoutedEventArgs e)
        {
            if (sender.Equals(HomeBtn))
            {
                Window.Current.Content = new Home();
                Window.Current.Activate();
            }
            else if (sender.Equals(WondersBtn))
            {
                Window.Current.Content = new Wonders();
                Window.Current.Activate();
            }
            else if (sender.Equals(MapsBtn))
            {
                Window.Current.Content = new WonderMap();
                Window.Current.Activate();
            }
        }


        private async void Button_Click(object sender, RoutedEventArgs e)
        {
            double longitude, latitude;
            if (sender.Equals(MyPosition))
            {
                Geolocator geo = new Geolocator();
                Geoposition position = await geo.GetGeopositionAsync();
                longitude = position.Coordinate.Point.Position.Latitude;
                latitude = position.Coordinate.Point.Position.Longitude;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Auroraa))
            {
                longitude = 44.006481;
                latitude = -79.450394;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Canyon))
            {
                longitude = 36.0544;
                latitude = 112.1401;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Barrier))
            {
                longitude = 18.2871;
                latitude = 147.6992;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Janeiro))
            {
                longitude = -22.970722;
                latitude = -43.182365;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Everest))
            {
                longitude = 27.9878;
                latitude = 86.9250;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Pari))
            {
                longitude = 19.4933;
                latitude = 102.2514;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Vic))
            {
                longitude = 17.9244;
                latitude = 25.8559;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(WallChinaa))
            {
                longitude = 40.4319;
                latitude = 116.5704;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Petraa))
            {
                longitude = 30.3285;
                latitude = 35.4444;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Redeemerr))
            {
                longitude = 22.9519;
                latitude = 43.2105;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Picchu))
            {
                longitude = 13.1631;
                latitude = 72.5450;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Chichen))
            {
                longitude = 20.6843;
                latitude = 88.5678;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(colo))
            {
                longitude = 41.8902;
                latitude = 12.4922;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Taj))
            {
                longitude = 27.1750;
                latitude = 78.0422;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Iguazuu))
            {
                longitude = 25.6953;
                latitude = 54.4367;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Longg))
            {
                longitude = 20.9712;
                latitude = 107.0448;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Jejuu))
            {
                longitude = 33.4890;
                latitude = 126.4983;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Puertoo))
            {
                longitude = 10.1926;
                latitude = 118.9266;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Table))
            {
                longitude = 33.9628;
                latitude = 18.4098;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Komodoo))
            {
                longitude = 8.5850;
                latitude = 119.4411;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Rainforest))
            {
                longitude = 3.4653;
                latitude = 62.2159;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Durbann))
            {
                longitude = 29.8587;
                latitude = 31.0218;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Vigann))
            {
                longitude = 17.5705;
                latitude = 120.3873;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Havanaa))
            {
                longitude = 23.1136;
                latitude = 82.3666;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Lumpur))
            {
                longitude = 3.1390;
                latitude = 101.6869;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Beirutt))
            {
                longitude = 33.8938;
                latitude = 35.5018;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Dohaa))
            {
                longitude = 25.2854;
                latitude = 51.5310;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Laa))
            {
                longitude = 16.4897;
                latitude = 68.1193;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Palauu))
            {
                longitude = 7.5150;
                latitude = 134.5825;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Belize))
            {
                longitude = 17.1856;
                latitude = 87.324;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Vents))
            {
                longitude = 46.302520;
                latitude = 46.302520;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Gala))
            {
                longitude = -0.777259;
                latitude = -91.142578;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Lake))
            {
                longitude = 53.5587;
                latitude = 108.1650;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
            else if (sender.Equals(Red))
            {
                longitude = 16.2584;
                latitude = 16.2584;
                MyMaps.Center = new Bing.Maps.Location(longitude, latitude);
            }
        }

        private void FlipChange_Click(object sender, RoutedEventArgs e)
        {
            if (sender.Equals(NaturalWonders))
            {
                WondersFlip.SelectedIndex = 1;
            }
            else if (sender.Equals(NewWonders))
            {
                WondersFlip.SelectedIndex = 2;                
            }
            else if (sender.Equals(CitiesWonders))
            {
                WondersFlip.SelectedIndex = 3;
            }
            else if (sender.Equals(UnderwaterWonders))
            {
                WondersFlip.SelectedIndex = 4;
            }
            else if (sender.Equals(NatureWonders))
            {
                WondersFlip.SelectedIndex = 5;
            }
        }

        private void Natural_PointerPressed(object sender, PointerRoutedEventArgs e)
        {
            
        }

        private void BackBtn_PointerEntered(object sender, PointerRoutedEventArgs e)
        {
            BackBtn.Source = new BitmapImage(new Uri("ms-appx:///Assets/Back2.png", UriKind.Absolute));
        }

        private void BackBtn_PointerPressed(object sender, PointerRoutedEventArgs e)
        {
            BackBtn.Source = new BitmapImage(new Uri("ms-appx:///Assets/Back3.png", UriKind.Absolute));
            Window.Current.Content = new Home();
            Window.Current.Activate();
        }

        private void BackBtn_PointerExited(object sender, PointerRoutedEventArgs e)
        {
            BackBtn.Source = new BitmapImage(new Uri("ms-appx:///Assets/Back1.png", UriKind.Absolute));
        }
    }
}
